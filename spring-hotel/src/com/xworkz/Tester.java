package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.confi.SpringConfi;
import com.xworkz.hotel.Hotel;


public class Tester {

public static void main(String[] args) {
	
	ApplicationContext application = new AnnotationConfigApplicationContext(SpringConfi.class);
	 Hotel person= application.getBean(Hotel.class);
	 System.out.println(person);
	}


}




