package com.example.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstore.domain.Book;
import com.example.bookstore.service.IBookService;

@RestController()
@Scope("request")
//@RequestMapping("/store")
public class BookController {
	
	
	@Autowired
	@Qualifier("bookService")
	private IBookService bookService;
	
	
	@RequestMapping("/")
	public String dummyMethod() {
		return "Welcome to ebook Store";
	}
	
//	@GetMapping(value="/book",produces= {MediaType.APPLICATION_JSON_VALUE})
//	public List<Book>getAllBook(){
//		return bookService.getAllBooks();
//	}
	@PostMapping(value="/insertbook",produces= {MediaType.APPLICATION_JSON_VALUE},
			consumes= {MediaType.APPLICATION_JSON_VALUE})
	public Book insertBook(@RequestBody Book book){
		return bookService.save(book);
	}
	@PutMapping(value="/updatebook",produces= {MediaType.APPLICATION_JSON_VALUE})
	public Book updateAnyBook(@RequestBody Book book){
		return bookService.update(book);
	}
	@DeleteMapping(value="/deletebook/{id}",produces= {MediaType.APPLICATION_JSON_VALUE})
	public void deleteBookbyid(@PathVariable String id){
		 bookService.delete(id);
	}
	@GetMapping(value="/bookbyid/{id}",produces= {MediaType.APPLICATION_JSON_VALUE})
	public Book getBookByid(@PathVariable String id){
		return bookService.getById(id);
	}
	

}
