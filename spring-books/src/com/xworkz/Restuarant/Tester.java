package com.xworkz.Restuarant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {

public static void main(String[] args) {
	
ApplicationContext application= new AnnotationConfigApplicationContext(Configur.class);
  Owner ow= application.getBean(Owner.class);
  //Restuarant rest =application.getBean(Restuarant.class);
  System.out.println(ow);
//rest.serveFood();
ow.getResturant().serveFood();
}


}
