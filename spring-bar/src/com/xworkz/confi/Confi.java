package com.xworkz.confi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.bar.Bar;

@Configuration
@ComponentScan(basePackages = "com.xworkz.waiters")
public class Confi {
@Bean
public Bar getBar()
{
	Bar bar =new Bar();
	return bar;
}


}
