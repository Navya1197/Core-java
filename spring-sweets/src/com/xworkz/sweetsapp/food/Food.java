package com.xworkz.sweetsapp.food;

import org.springframework.stereotype.Component;

import com.xworkz.sweetsapp.spareparts.SpareParts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data

@AllArgsConstructor
@Getter
@Setter
@ToString
@Component
@NoArgsConstructor

public class Food {

	/*public Food()
	{
		System.out.println(this.getClass().getSimpleName()+" object is created");
	}*/

	private int id;
	private String name;
	 

	}






