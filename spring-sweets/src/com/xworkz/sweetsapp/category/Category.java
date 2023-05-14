package com.xworkz.sweetsapp.category;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@ToString
@Component
@AllArgsConstructor
@Data

public class Category {

	public Category()
	{
		System.out.println(this.getClass().getSimpleName()+" object is created");
	}

	private int id;
	private String name;
	 




}
