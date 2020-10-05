package com.example.Book;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BOOK_TABLE")
public class BookRequest {

	@Id
	private Integer book_id;
	private String title, author, year;

	public BookRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getBook_id() {
		return book_id;
	}





	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}







	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

}
