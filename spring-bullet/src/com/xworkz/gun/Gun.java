package com.xworkz.gun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.xworkz.bullet.Bullent;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

@ToString
@Component


public class Gun {
 @Value("1")
	private int id;
 @Value("kav")
	private String name;
 @Autowired
	private Bullent bullet;




}
