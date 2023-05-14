package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.config.Config;

import com.xworkz.juice.Juice;


public class Tester {

public static void main(String[] args) {
	
	ApplicationContext application = new AnnotationConfigApplicationContext(Config.class);
	 Juice person= application.getBean(Juice.class);
	 System.out.println(person);
	}	
	
}



