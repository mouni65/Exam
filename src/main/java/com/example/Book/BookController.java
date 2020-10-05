package com.example.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@Autowired
	BookService service;

	@PostMapping("/saveBook")
	public BookRequest callBookService(@RequestBody BookRequest request) {

		BookRequest book = service.saveBook(request);
		System.out.println("Book  "+book.getTitle());
		return book;
	}

}
