package com.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.main.model.Book;
import com.main.repository.BookRepository;

@SpringBootApplication
public class BookDetailsRedisApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BookDetailsRedisApplication.class, args);
	}

	@Autowired
	@Qualifier("bookRepository")
	BookRepository bookRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		bookRepository.save(new Book("Java", "Oracle", "1995"));
		bookRepository.save(new Book("Python", "python.org", "1991"));
		
		System.out.println(bookRepository.findAll());
	}

}
