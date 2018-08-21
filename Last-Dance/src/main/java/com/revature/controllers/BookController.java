package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entities.Book;
import com.revature.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

	
	private BookService bookservice;

	
	@Autowired
	public BookController(BookService bookservice) {
		this.bookservice = bookservice;
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(method= RequestMethod.GET, produces="application/json")
	@PreAuthorize("hasAuthority('READ_PRIVILEGE')")
	public ResponseEntity<List<Book>> listAllBooks(){
		return new ResponseEntity<>((List<Book>)bookservice.getAllBooks(), HttpStatus.OK);
	}
	
	
}
