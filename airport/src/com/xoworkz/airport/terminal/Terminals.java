package com.xoworkz.airport.terminal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Terminals
{
	private int id;
	private String name;
	private int number;

/*public Terminals(String name,int id,int number)
	{
	this.name =name;
	this.id =id;
	this.number=number;*/
@Override
	public   String toString()
	{
	return "Terminals(id ="+this.id+",name ="+this.name+", number="+this.number+")";	
	}
}
 

	













