package com.lmdlearning.library_exercise.libraryManagement;

import java.util.List;

public interface BookService {
	
	void addBook(Book book);
	void updateBook(Book book);
	void deleteBook(Long bookId);
	Book getBookById(Long bokId);
	List<Book> getAllBooks();

}
