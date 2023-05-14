package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.institute.Institute;
import com.xworkz.spring.Confi;

public class Tester {

public static void main(String[] args) {
	

	ApplicationContext application = new AnnotationConfigApplicationContext(Confi.class);
	 Institute person= application.getBean(Institute.class);
	 System.out.println(person);
	}




}



