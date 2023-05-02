package com.xworkz.theatre.screen;

import java.io.Serializable;



import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor//constructor replaced by this
@NoArgsConstructor
public class Screen  implements Serializable,Comparable<Screen>{
	public String name;
	public String city;
	public int id;

	/*public Screen(String name,String city,int id)
	{
	this.name =name;
	this.city =city;
	this.id=id;*/

	//Sop replaced by this
	@Override
	public String toString()
	{
		return "Screen(name="+this.name+",city="+this.city+",id="+this.id+")";
	}

	@Override
	public int hashCode()
	{
		return id;
	}
	
	
	@Override
	public int compareTo(Screen o) {
		// TODO Auto-generated method stub
		return this.hashCode()-o.hashCode();
	}

	
	
	
	
	
	
	
	
	
	
	
	}








