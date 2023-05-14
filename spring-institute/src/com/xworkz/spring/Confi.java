package com.xworkz.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.institute.Institute;

@Configuration
@ComponentScan(basePackages = "com.xworkz.branch")
public class Confi {
@Bean
public Institute getInstitute()
{
	Institute in = new Institute();
	return in;
	
}


}
