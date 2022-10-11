package com.main.service;

import java.util.List;

import com.main.model.Book;

public interface IBookService {

	Book save(Book book);
	Book update(Book book);
	void delete(String id);
	Iterable<Book> getAllBooks();
	Book findById(String id);
	List<Book> getAllBooksByTitle(String title);
	List<Book> getAllBooksByYear(String year);
}
