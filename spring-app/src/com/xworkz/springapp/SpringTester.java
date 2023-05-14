package com.xworkz.springapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springapp.config.Config;
import com.xworkz.springapp.controller.AmunsementParkController;
import com.xworkz.springapp.dto.AmunsementParkDTO;
import com.xworkz.springapp.exception.AmunsementParkException;

public class SpringTester {
public static void main(String[] args) throws AmunsementParkException {
	
AmunsementParkDTO amunsementParkDTO = new AmunsementParkDTO();

ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
AmunsementParkController control   = context.getBean(AmunsementParkController.class);
AmunsementParkDTO dt = context.getBean(AmunsementParkDTO.class);
 AmunsementParkDTO saveDto = control.process(amunsementParkDTO);
System.out.println(saveDto);


}



}
