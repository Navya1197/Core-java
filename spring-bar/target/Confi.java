package com.xworkz.Restuarant;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.xworkz.booksapp")

public class Confi {

@Bean
public Restuarant getRestuarant()
{
	
	Restuarant rest =new Restuarant();
	return new Restuarant;
	
}



}
