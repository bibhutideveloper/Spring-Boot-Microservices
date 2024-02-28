package com.bibhuti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bibhuti.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

	
	
}
