package com.xworkz.companyapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.companyapp.company.Company;
import com.xworkz.companyapp.confi.Confi;


public class Tester {

public static void main(String[] args) {
	
	ApplicationContext application = new AnnotationConfigApplicationContext(Confi.class);
	 Company cm = application.getBean(Company.class);
	 System.out.println(cm);
	}


}



