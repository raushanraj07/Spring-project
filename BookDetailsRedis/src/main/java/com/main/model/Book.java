package com.main.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash
public class Book {

	@Id
	private String id;
	private String title;
	private String publisher;
	private String year;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	
	public Book(String title, String publisher, String year) {
		super();
		this.title = title;
		this.publisher = publisher;
		this.year = year;
	}
	public Book(String id, String title, String publisher, String year) {
		super();
		this.id = id;
		this.title = title;
		this.publisher = publisher;
		this.year = year;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", publisher=" + publisher + ", year=" + year + "]";
	}
	
	
}
