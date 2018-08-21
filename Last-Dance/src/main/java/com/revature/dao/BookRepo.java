package com.revature.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.entities.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

	
}
