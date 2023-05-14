package com.xworkz.booksapp.books;


import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.ToString;


@ToString

@Component
@AllArgsConstructor


public class Books {
	public Books()
	{
		System.out.println(this.getClass().getSimpleName()+" object is created");
	}

public int id;
public String name;
public String authorName;
public int yrOfPublication;


}
