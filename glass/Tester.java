package com.xworkz.glass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

public static void main(String[] args) {
	
ApplicationContext application =new AnnotationConfigApplicationContext(SpringConfiguration.class);
 Glass gls = application.getBean("glass",Glass.class);
       System.out.println(gls);
       Glass gls1 = application.getBean("glass1",Glass.class);
       System.out.println(gls1);
       Glass gls2 = application.getBean("glass2",Glass.class);
       System.out.println(gls2);
       Glass gls3 = application.getBean("glass3",Glass.class);
       System.out.println(gls3);
       Glass gls4 = application.getBean("glass4",Glass.class);
       System.out.println(gls4);

}


}
