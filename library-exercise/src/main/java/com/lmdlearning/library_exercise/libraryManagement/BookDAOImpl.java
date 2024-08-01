package com.lmdlearning.library_exercise.libraryManagement;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAOImpl implements BookDAO {

	private final JdbcTemplate jdbcTemplate;
	
	public BookDAOImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addBook(Book book) {

		String sql = "INSERT into books (title, author, isAvailable) VALUES (?, ?, ?)";
		jdbcTemplate.update(sql, book.getTitle(), book.getAuthor(), book.isAvailable());
				
	}

	@Override
	public void updateBook(Book book) {

		String sql = "UPDATE books SET title = ?, author = ?, isAvailable = ? WHERE id = ?";
		jdbcTemplate.update(sql, book.getTitle(), book.getAuthor(), book.isAvailable());
	}

	@Override
	public void deleteBook(Long bookId) {

		String sql = "DELETE FROM books WHERE id = ?";
		jdbcTemplate.update(sql, bookId);
	}

	@Override
	public Book findBookById(Long bookId) {

		String sql = "SELECT * FROM books WHERE id = ?";
		
		return jdbcTemplate.queryForObject(sql, new BookRowMapper(), bookId);
	}

	@Override
	public List<Book> findAllBooks() {
		
		String sql = "SELECT * FROM books";
        return jdbcTemplate.query(sql, new BookRowMapper());
	}
	
	
	private static class BookRowMapper implements RowMapper<Book> {
        @Override
        public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
            Book book = new Book();
            book.setId(rs.getLong("id"));
            book.setTitle(rs.getString("title"));
            book.setAuthor(rs.getString("author"));
            book.setAvailable(rs.getBoolean("isAvailable"));
            return book;
        }
    }
	
	
}
