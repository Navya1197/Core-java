package com.xworkz.springappp1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springApp.Person;
import com.xworkz.springApp.SpringConfiguration;

public class Tester {
	public static void main(String[] args) {
		
	
ApplicationContext application =new AnnotationConfigApplicationContext(SpringConfiguration.class);
	Person per=application.getBean("person",Person.class);
	System.out.println(per);
	Person per1 = application.getBean("person1",Person.class);
	System.out.println(per1);
	Person per2 = application.getBean("person2",Person.class);
	System.out.println(per2);
	Person per3 = application.getBean("person3",Person.class);
	System.out.println(per3);
	Person per4 = application.getBean("person4",Person.class);
	System.out.println(per4);
}
}
