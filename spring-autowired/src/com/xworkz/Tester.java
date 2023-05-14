package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.doors.house.House;
import com.xworkz.doors.springconfi.SpringConfiguration;

public class Tester {

public static void main(String[] args) {
	
ApplicationContext application = new AnnotationConfigApplicationContext(SpringConfiguration.class);
House house =application.getBean(House.class);
System.out.println(house);


}


}
