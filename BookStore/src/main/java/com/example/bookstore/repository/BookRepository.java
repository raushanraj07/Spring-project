package com.example.bookstore.repository;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookstore.domain.Book;


@Repository("bookRepository")
@Scope("singleton")
public interface BookRepository extends JpaRepository<Book, Integer>{


	//List<Book> findTitle(String book_title);

	
	

	
	 }
