package com.lmdlearning.library_exercise.libraryManagement;

import java.util.List;

public class BookServiceImpl implements BookService {

	private final BookDAO bookDAO;

	public BookServiceImpl(BookDAO bookDAO) {
		super();
		this.bookDAO = bookDAO;
	}

	@Override
	public void addBook(Book book) {

		bookDAO.addBook(book);
	}

	@Override
	public void updateBook(Book book) {

		bookDAO.updateBook(book);
	}

	@Override
	public void deleteBook(Long bookId) {

		bookDAO.deleteBook(bookId);
	}

	@Override
	public Book getBookById(Long bokId) {

		return bookDAO.findBookById(bokId);
	}

	@Override
	public List<Book> getAllBooks() {

		return bookDAO.findAllBooks();
	}
	
	
}
