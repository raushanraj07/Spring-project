package com.example.bookstore.service;

import java.util.List;

import com.example.bookstore.domain.Book;

public interface IBookService {

	Book save(Book book);
	Book update(Book book);
	void delete(String id);
	//List<Book>getAllBooks();
	
	
	
	Book getById(String id);
	

}
