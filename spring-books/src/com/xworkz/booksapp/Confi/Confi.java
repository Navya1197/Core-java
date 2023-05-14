package com.xworkz.booksapp.Confi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import com.xworkz.booksapp.books.Books;
import com.xworkz.booksapp.library.Library;



@Configuration
@ComponentScan(basePackages = "com.xworkz.booksapp")
public class Confi {
	
	@Bean
	public Library getLibrary()
	{
		return new Library();
	}
@Bean
@Order(1)
	public Books getBooks()
	{
		return new Books(1,"navya","kavya",1234);
		
	}
@Bean
@Order(2)
	public Books getBooks1()
	{
		return new Books(1,"nav","kav",12);
		
	}

	
	}
	




