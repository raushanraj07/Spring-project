package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.bookstore.domain.Book;
import com.example.bookstore.repository.BookRepository;

@SpringBootApplication
public class BookStore1Application implements CommandLineRunner{
	
	@Autowired
	@Qualifier("bookRepository")
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookStore1Application.class, args);
		System.out.println("Spring boot application");
		
	}

@Override
public void run(String... args) throws Exception {
	bookRepository.save(new Book("1",".Net Developer Using the Compiler API","John",978-1-484221-10-5,176,2016));
	bookRepository.save(new Book("2",".Net Developer Using the Compiler API","John",978-1-484221-10-5,176,2016));
	
	
} 
}
