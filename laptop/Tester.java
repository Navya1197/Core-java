package com.xworkz.laptop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {

public static void main(String[] args) {
	
ApplicationContext application =new AnnotationConfigApplicationContext(SpringConfiguration.class);
Laptop lp =  application.getBean("laptop",Laptop.class);
System.out.println(lp);

Laptop lp1 =  application.getBean("laptop1",Laptop.class);
System.out.println(lp1);

Laptop lp2 =  application.getBean("laptop2",Laptop.class);
System.out.println(lp2);

Laptop lp3 =  application.getBean("laptop3",Laptop.class);
System.out.println(lp3);

Laptop lp4 =  application.getBean("laptop4",Laptop.class);
System.out.println(lp4);


}


}
