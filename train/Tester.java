package com.xworkz.train;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

public static void main(String[] args) {
	
ApplicationContext application =new AnnotationConfigApplicationContext(SpringConfiguration.class);
Train tr =application.getBean("train",Train.class);
System.out.println(tr);

Train tr1 =application.getBean("train1",Train.class);
System.out.println(tr1);

Train tr2=application.getBean("train2",Train.class);
System.out.println(tr2);

Train tr3 =application.getBean("train3",Train.class);
System.out.println(tr3);

Train tr4 =application.getBean("train4",Train.class);
System.out.println(tr4);


}


}
