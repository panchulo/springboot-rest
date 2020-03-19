package cl.cnsv.poc.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.cnsv.poc.model.Book;
import cl.cnsv.poc.repository.BookRepository;

@Service("bookService")
public class BookService {

	private static final Logger LOGGER = LoggerFactory.getLogger(BookService.class);

	@Autowired
	private BookRepository bookRepository;

	public Book getById(int id) {
		Book book = bookRepository.getById(id);
		return book;
	}

	public List<Book> getAll() {
		List<Book> books = bookRepository.getAll();
		return books;
	}

}