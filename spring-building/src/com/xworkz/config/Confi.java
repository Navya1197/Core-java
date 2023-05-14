package com.xworkz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.xworkz.building.Building;

@Configuration
@ComponentScan(basePackages = "com.xworkz.room")
public class Confi {
@Bean
public Building getBuild()
{
	Building  bld= new Building();
	return bld;
			
}

}
