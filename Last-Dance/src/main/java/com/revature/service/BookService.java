package com.revature.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.BookRepo;
import com.revature.entities.Book;

@Service
public class BookService {

	public BookRepo bookrepo;
	
	@Autowired
	public BookService(BookRepo bookrepo) {
		this.bookrepo = bookrepo;
	}
	
	@Transactional
	public Iterable<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookrepo.findAll();
	}

	

}
