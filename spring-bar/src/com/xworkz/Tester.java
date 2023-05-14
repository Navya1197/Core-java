package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.bar.Bar;
import com.xworkz.confi.Confi;



public class Tester {

public static void main(String[] args) {
	
	ApplicationContext application = new AnnotationConfigApplicationContext(Confi.class);
	Bar bar =application.getBean(Bar.class);
	System.out.println(bar);



}


}
