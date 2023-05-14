package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.channel.Channel;
import com.xworkz.springconfi.SpringConfig;
import com.xworkz.springconfi.SpringConfiguration;

public class Tester1 {

public static void main(String[] args) {
	

	ApplicationContext application = new AnnotationConfigApplicationContext(SpringConfiguration.class);
	Channel  team1 = application.getBean(Channel.class);
	 System.out.println(team1);




}


}
