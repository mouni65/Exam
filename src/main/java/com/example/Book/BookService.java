package com.example.Book;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

			@Autowired
	private BookRepository repository;

	
	public BookRequest saveBook(BookRequest request) {
		
		return repository.save(request);
	}

}
