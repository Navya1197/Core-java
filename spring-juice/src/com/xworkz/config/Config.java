package com.xworkz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.juice.Juice;
@Configuration
@ComponentScan(basePackages = "com.xworkz.fruit")
public class Config {
@Bean
public Juice getJuice()
{
	Juice j= new Juice();
	return j;
}



}
