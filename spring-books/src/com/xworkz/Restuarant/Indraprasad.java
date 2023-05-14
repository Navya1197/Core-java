package com.xworkz.Restuarant;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Component(value="Indraprasad")
public class Indraprasad implements Restuarant
{
	@Override
		public String serveFood() {
			System.out.println("indraprasad is created");
			return Restuarant.super.serveFood();
		}
	

	
}
