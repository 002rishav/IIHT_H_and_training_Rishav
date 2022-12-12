package com.library.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String book_name;
	private String book_author;
	private Float book_price;
	private String book_genre;
	private Boolean borrowed_status;
	
	public Library(Integer id, String book_name, String book_author, Float book_price, String book_genre,
			Boolean borrowed_status) {
		super();
		this.id = id;
		this.book_name = book_name;
		this.book_author = book_author;
		this.book_price = book_price;
		this.book_genre = book_genre;
		this.borrowed_status = borrowed_status;
	}

	public Library() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getBook_author() {
		return book_author;
	}

	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}

	public Float getBook_price() {
		return book_price;
	}

	public void setBook_price(Float book_price) {
		this.book_price = book_price;
	}

	public String getBook_genre() {
		return book_genre;
	}

	public void setBook_genre(String book_genre) {
		this.book_genre = book_genre;
	}

	public Boolean getBorrowed_status() {
		return borrowed_status;
	}

	public void setBorrowed_status(Boolean borrowed_status) {
		this.borrowed_status = borrowed_status;
	}

}
