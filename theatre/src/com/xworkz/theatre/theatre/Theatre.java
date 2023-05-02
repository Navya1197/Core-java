package com.xworkz.theatre.theatre;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.xworkz.theatre.Comparator1.NameComparator;
import com.xworkz.theatre.exception.ScreenNotFoundException;
import com.xworkz.theatre.screen.Screen;

public class Theatre {
	Screen screen[] ;
	int index;
	public Theatre(int size)
	{
	System.out.println("theatre object is created");
	screen =new Screen[size];
	}
	public boolean fetch(Screen screen) 
	{
	System.out.println("screen process is created");	
	boolean isfetching = false;
	if(screen.name != null&&screen.name!=" ")
	{
	this.screen[index++]= screen;
	isfetching = true;
	}

	System.out.println("screen process is ended");
	return isfetching;
	}
	public void getDisplay()
	{
	System.out.println("list of screen are");
	for(index=0;index<this.screen.length; index++)
	{
	System.out.println(screen[index]);                                     

	}
	
}
	
	public  Screen getScreenByScreenName(String name) throws ScreenNotFoundException
	{
	System.out.println("Inside screen by screen name method"); 
	for(int in=0; in<screen.length; in++)
	{
	if(screen[in].name.equals(name))
	{
	System.out.println("screen name is matching...proceed");
	System.out.println(screen[in]);//System.out.println(screen[in].name+" "+screen[in].city+"   "+screen[in].id);
	return screen[in];
	}
	else
	{
		throw new ScreenNotFoundException(name);
	}
	}
	return null;
	}	
	public  Screen getScreenByScreenCity(String city) throws ScreenNotFoundException
	{
	System.out.println("Inside get screen by screencity method"); 
	for(int in=0; in<screen.length; in++)
	{
	if(screen[in].city.equals(city))
	{
	System.out.println("screen city is matching...proceed");
	System.out.println(screen[in]); //System.out.println(screen[in].name+" "+screen[in].city+"   "+screen[in].id);
	return screen[in];
	}
	else
	{
		throw new ScreenNotFoundException(city);
	}
	}
	System.out.println("end of the get screen city mathod");
	
	return null;
	}	
	public  Screen getScreenByScreenId(int id)
	{
	System.out.println("Inside get  by id method"); 
	for(int in=0; in<screen.length; in++)
	{
	if(screen[in].id ==id)
	{
	System.out.println("screen id is matching...proceed");
	System.out.println(screen[in]); //System.out.println(screen[in].name+" "+screen[in].city+"   "+screen[in].id);
	return screen[in];
	}
	System.out.println("end of the get screen id mathod");
	}
	return null;
	}
	public boolean updateScreenIdByScreenName(int newId,String name) throws ScreenNotFoundException
	{
	boolean isTerminalNumberUpdated = false;
	System.out.println("updated id started");
	for (int i= 0; i< screen.length; i++)
	{
	if(screen[i].name.equals(name))
	{
	System.out.println("the Current number is "+screen[i].id);
	screen[i].id=(newId);
	System.out.println("the updated number is "+screen[i].id);
	}
	//return isTerminalNumberUpdated;
	else
{
	throw new ScreenNotFoundException(name);
}
	}
	
	return isTerminalNumberUpdated;
	
	//List list =new ArrayList();
	//Collections.sort(list, new NameComparator());
}
}




	












	


















