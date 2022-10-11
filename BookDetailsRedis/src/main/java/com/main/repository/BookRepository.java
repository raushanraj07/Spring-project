package com.main.repository;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.main.model.Book;

@Repository("bookRepository")
@Scope("singleton")
public interface BookRepository extends CrudRepository<Book, String> {

	List<Book> findByTitle(String title);

	List<Book> findByYear(String year);

}
