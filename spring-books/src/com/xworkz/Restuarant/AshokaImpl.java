package com.xworkz.Restuarant;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Component(value="AshokaImpl")
public class AshokaImpl implements Restuarant 
 {

@Override
	public String serveFood() {
		System.out.println("serving food");
		return Restuarant.super.serveFood();
	}
	




}
 