package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.building.Building;
import com.xworkz.config.Confi;

public class Tester {

public static void main(String[] args) {
	
	ApplicationContext application = new AnnotationConfigApplicationContext(Confi.class);
	 Building rm= application.getBean(Building.class);
	 System.out.println(rm);
	}



}



