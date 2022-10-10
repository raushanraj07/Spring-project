package com.example.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.example.bookstore.domain.Book;
import com.example.bookstore.repository.BookRepository;

@Service("bookService")
@Scope("singleton")
public class BookService implements IBookService{

	
	@Autowired
	@Qualifier("bookRepository")
	private BookRepository bookRepository;
	
	
	@Override
	public Book save(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public Book update(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public void delete(int id) {
		bookRepository.deleteById(id);
		
	}



	@Override
	public List<Book>getAllBooks() {
		
		return bookRepository.findAll();
	}
//
    @Override
    public Book getById(int id) {
	return bookRepository.findById(id).get() ;
	}
//
//	@Override
//	public List<Book> getAllBookByTitle(String book_title) {
//		return bookRepository.findTitle(book_title);
//	}
//
	
//	@Override
//	public Book getBookByYear(int book_year) {
//		return bookRepository.findByYear(book_year);
//	}
//
//	@Override
//	public Book getByISBN(int book_isbn) {
//		return bookRepository.findByISBN(book_isbn);
//	}

}
