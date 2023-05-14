package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.channel.Channel;
import com.xworkz.springconfi.SpringConfig;
import com.xworkz.team.Team;


public class Tester {
	public static void main(String[] args) {
		
	

	ApplicationContext application = new AnnotationConfigApplicationContext(SpringConfig.class);
	 Team  team= application.getBean(Team.class);
	 System.out.println(team);

	 

	}
}
