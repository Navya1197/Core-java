package com.xworkz.booksapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.booksapp.Confi.Confi;
import com.xworkz.booksapp.library.Library;

public class Tester {

public static void main(String[] args) {
	
	ApplicationContext application = new AnnotationConfigApplicationContext(Confi.class);
	 Library cm = application.getBean(Library.class);
	 System.out.println(cm);
	}



}


