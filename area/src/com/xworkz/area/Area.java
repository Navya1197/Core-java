package com.xworkz.area;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter



public class Area {
	public Area()
	{
	
	}
//encapsulation
	private String name;
	private int code;
	private int block;

	public Area(String name,int code,int block)
	{
	this.name = name;
	this.code = code;
	this.block =block;

	}
	
}