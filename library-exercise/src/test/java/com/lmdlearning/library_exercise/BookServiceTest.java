package com.lmdlearning.library_exercise;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lmdlearning.library_exercise.libraryManagement.Book;
import com.lmdlearning.library_exercise.libraryManagement.BookService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config.xml")
public class BookServiceTest {
	@Autowired
    private BookService bookService;

    @Before
    public void setUp() {
        Book book1 = new Book();
        book1.setTitle("Java Programming");
        book1.setAuthor("John Doe");
        book1.setAvailable(true);

        Book book2 = new Book();
        book2.setTitle("Spring Framework");
        book2.setAuthor("Jane Doe");
        book2.setAvailable(true);

        bookService.addBook(book1);
        bookService.addBook(book2);
    }

    @Test
    public void testAddBook() {
        Book book = new Book();
        book.setTitle("Test Driven Development");
        book.setAuthor("Kent Beck");
        book.setAvailable(true);

        bookService.addBook(book);

        Book retrievedBook = bookService.getBookById(book.getId());
        assertEquals("Test Driven Development", retrievedBook.getTitle());
    }

    @Test
    public void testUpdateBook() {
        Book book = bookService.getBookById(1L);
        book.setAuthor("Updated Author");

        bookService.updateBook(book);

        Book updatedBook = bookService.getBookById(1L);
        assertEquals("Updated Author", updatedBook.getAuthor());
    }

    @Test
    public void testDeleteBook() {
        bookService.deleteBook(1L);

        Book book = bookService.getBookById(1L);
        assertNull(book);
    }

    @Test
    public void testGetAllBooks() {
        List<Book> books = bookService.getAllBooks();
        assertEquals(2, books.size());
    }

}
