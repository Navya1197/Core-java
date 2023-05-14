package com.xworkz.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

public static void main(String[] args) {
	
ApplicationContext application =new AnnotationConfigApplicationContext(SpringConfiguaration.class);
Man m   =  application.getBean("man", Man.class);
System.out.println(m);

Man m1   =  application.getBean("man1",Man.class);
System.out.println(m1);
Man m2   =  application.getBean("man2",Man.class);
System.out.println(m2);
Man m3  =  application.getBean("man3",Man.class);
System.out.println(m3);
Man m4   =  application.getBean("man4",Man.class);
System.out.println(m4);

}





}
