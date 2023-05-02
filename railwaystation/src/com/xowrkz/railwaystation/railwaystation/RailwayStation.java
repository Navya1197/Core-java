package com.xowrkz.railwaystation.railwaystation;

import com.xowrkz.railwaystation.platform.Platform;

public class RailwayStation {
	
	Platform   platform[];
	int index;
	public RailwayStation(int size)
	{
	System.out.println("Railway object is created");
	platform =new Platform[size];
	}
	public boolean fetch(Platform platform) 
	{
	System.out.println("platform process is created");	
	boolean isfetching = false;
	if(platform.name != null)
	{
	this.platform[index++]= platform;
	isfetching = true;
	}
	
	System.out.println("platform process is ended");
	return isfetching;
	}
	public void getDisplay()
	{
	System.out.println("list of platforms are");
	for(index=0;index<this.platform.length; index++)
	{
	System.out.println(platform[index].name+" "+platform[index].city+"  "+platform[index].id);                                     
	//System.out.println(this.patient[index]);
	//System.out.println(this.customer[index]);
	}
	}
	}

























