package com.lmdlearning.library_exercise.libraryManagement;

import java.util.List;

public interface BookDAO {
	void addBook(Book book);
	void updateBook(Book book);
	void deleteBook(Long bookId);
	Book findBookById(Long bookId);
	List<Book> findAllBooks();

}
