package com.digitalbooks.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String logo;
	private String title;
	private String category;
	private String price;
	private Integer authorID;
	private String author;
	private String publisher;
	private Date published_date;
	private String chapters;
	private boolean active;
	
	public Book() {
		super();
	}

	public Book(Integer id, String logo, String title, String category, String price, Integer authorID, String author,
			String publisher, Date published_date, String chapters, boolean active) {
		super();
		this.id = id;
		this.logo = logo;
		this.title = title;
		this.category = category;
		this.price = price;
		this.authorID = authorID;
		this.author = author;
		this.publisher = publisher;
		this.published_date = published_date;
		this.chapters = chapters;
		this.active = active;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getPublished_date() {
		return published_date;
	}

	public void setPublished_date(Date published_date) {
		this.published_date = published_date;
	}

	public String getChapters() {
		return chapters;
	}

	public void setChapters(String chapters) {
		this.chapters = chapters;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Integer getAuthorID() {
		return authorID;
	}

	public void setAuthorID(Integer authorID) {
		this.authorID = authorID;
	}

}
