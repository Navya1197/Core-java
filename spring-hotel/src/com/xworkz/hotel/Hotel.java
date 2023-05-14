package com.xworkz.hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.xworkz.chef.Chef;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component
public class Hotel {

	@Value("1")	
	private int id;
	@Value("sangam")
	private String name;
	@Autowired
	private Chef chef;

}
