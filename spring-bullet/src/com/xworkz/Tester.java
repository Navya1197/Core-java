package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.confi.Confi;
import com.xworkz.gun.Gun;



public class Tester {



public static void main(String[] args) {
	
	
	
	ApplicationContext application = new AnnotationConfigApplicationContext(Confi.class);
	 Gun rm= application.getBean(Gun.class);
	 System.out.println(rm);
	}

}

