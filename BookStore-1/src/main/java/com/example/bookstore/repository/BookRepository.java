package com.example.bookstore.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.bookstore.domain.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
