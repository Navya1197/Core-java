package com.xworkz.booksapp.library;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.xworkz.booksapp.books.Books;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

@ToString




public class Library {

	
	@Autowired
	public List<Books> books;


	}





