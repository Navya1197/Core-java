package com.xworkz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.phone.Phone;

@Configuration
@ComponentScan(basePackages = "com.xworkz.application")
public class SpringConf {

@Bean
public Phone getPhone()
{
Phone ph= new Phone();
return ph;	
}




}
