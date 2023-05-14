package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configuration.SpringConf;
import com.xworkz.phone.Phone;


public class Tester {

public static void main(String[] args) {
	
	ApplicationContext application = new AnnotationConfigApplicationContext(SpringConf.class);
	 Phone phn= application.getBean(Phone.class);
	 System.out.println(phn);
	}
	
	
	
}




