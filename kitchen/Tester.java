package com.xworkz.kitchen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

public static void main(String[] args) {
	
ApplicationContext application =new AnnotationConfigApplicationContext(SpringConfiguration.class);
Kitchen  kit=   application.getBean("kitchen",Kitchen.class);
   System.out.println(kit);
   Kitchen  kit1=   application.getBean("kitchen1",Kitchen.class);
   System.out.println(kit1);
   Kitchen  kit2=   application.getBean("kitchen2",Kitchen.class);
   System.out.println(kit2);
   Kitchen  kit3=   application.getBean("kitchen3",Kitchen.class);
   System.out.println(kit3);
   Kitchen  kit4=   application.getBean("kitchen4",Kitchen.class);
   System.out.println(kit4);




}


}
