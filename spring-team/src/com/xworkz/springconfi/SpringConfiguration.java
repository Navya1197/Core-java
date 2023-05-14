package com.xworkz.springconfi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.channel.Channel;



	@Configuration
	@ComponentScan(basePackages = "com.xworkz.viewers")
	public class SpringConfiguration {
	@Bean
	public Channel getChannel()
	{
		Channel ch =new Channel();
		return ch;
		
	}
	}




