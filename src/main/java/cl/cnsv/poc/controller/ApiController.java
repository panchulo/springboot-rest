package cl.cnsv.poc.controller;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.cnsv.poc.constant.ApiConstant;
import cl.cnsv.poc.model.Book;
import cl.cnsv.poc.service.BookService;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Validated
@RestController
@RequestMapping("/api/v1/book")
public class ApiController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ApiController.class);

	@Autowired
	@Qualifier("bookService")
	private BookService bookService;

	@GetMapping(value = "")
	public ResponseEntity<?> getAllBooks() {
		log.info("Get all books from DB...");
		return new ResponseEntity<>(bookService.getAll(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Book> getPublisherById(
			@Valid @Pattern(regexp = ApiConstant.REGEX_FOR_NUMBERS, message = ApiConstant.MESSAGE_FOR_REGEX_NUMBER_MISMATCH) @PathVariable(value = "id") String id) {
		log.info("Get book with id: " + id);
		return new ResponseEntity<>(bookService.getById(Integer.parseInt(id)), HttpStatus.OK);
	}

}