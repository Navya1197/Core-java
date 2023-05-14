package com.xworkz.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.person.Person;

@Configuration
@ComponentScan(basePackages = "com.xworkz.address")
public class SpringConfig {

@Bean
public Person getPerson()
{
	Person pr =new Person();
	return pr;
	
}





}
