package com.xworkz.doors.springconfi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.doors.house.House;

@Configuration
@ComponentScan(basePackages = "com.xworkz.doors")
public class SpringConfiguration {

@Bean
public House getHouse()
{
	
	House hs = new House();
	return hs; 
	
}
}