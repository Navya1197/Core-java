package com.xworkz.confi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.xworkz.hotel.Hotel;

@Configuration
@ComponentScan(basePackages = "com.xworkz.chef")
public class SpringConfi {
@Bean
public Hotel getHotel()
{
	Hotel ht =new Hotel();
	return ht;
}



}
