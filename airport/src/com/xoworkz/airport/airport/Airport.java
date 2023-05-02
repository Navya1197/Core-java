package com.xoworkz.airport.airport;

import com.xoworkz.airport.exception.TerminalNotFoundException;
import com.xoworkz.airport.terminal.Terminals;

public class Airport {

 Terminals terminal[];
	int index;
	public Airport(int size)
	{
	System.out.println("Airport object is created");
	terminal =new Terminals[size];
	}
	public boolean fetch(Terminals terminal) 
	{
	System.out.println("terminal process is created");	
	boolean isfetching = false;
	if(terminal.getName()!=null && terminal.getName()!=" ")
	{
	this.terminal[index++]= terminal;
	
	isfetching = true;
	}
	System.out.println("terminal process is ended");
	return isfetching;
	}
	
	public void getTerminals()
	{
	System.out.println("list of terminals are");
	for(Terminals tr: terminal )
	{
	System.out.println(tr);              
	}
	}
	public Terminals getTerminalByTerminalId(int id)
	{
	System.out.println("inside get terminalby terminal id"); 
	for(Terminals tr :terminal)
	{
	if(tr.getId() == id)
	{
	System.out.println("terminal id is matching.......proces the data");
	System.out.println(tr);
	return  tr;
	}
	System.out.println("end of the terminal id mathod");
	}
	return null;
	}
	
	public  Terminals getTerminalByTerminalName(String name) throws TerminalNotFoundException
	{
	System.out.println("Inside terminal name method");
	for(Terminals tr :terminal)
 	{
	if(tr.getName().equals(name))
	{
	System.out.println("terminal name is matching...proceed");
	System.out.println(tr);//System.out.println(terminal[in].name+" "+terminal[in].id+"   "+terminal[in].number);
	return  tr;
	}
	else 
	{
		throw new TerminalNotFoundException(name);
	}
	}
	System.out.println("end of the terminal name mathod");
	
	return null;
	}
	public  Terminals getTerminalByTerminalNumber(int number)
	{
	System.out.println("Inside terminal name method");
	for(Terminals tr :terminal)
	{
	if(tr.getNumber() ==number)
	{
	System.out.println("terminal name is matching...proceed");
	  System.out.println(tr);// System.out.println(terminal[in].name+" "+terminal[in].id+"   "+terminal[in].number);
	return  tr;
	}
	System.out.println("end of the terminal name mathod");
	}
	return null;
	}
	public boolean updateTerminalNumberByTerminalName(int newNumber,String name) throws TerminalNotFoundException
	{
	boolean isTerminalNumberUpdated = false;
	System.out.println("updated terminalnumber started");
	for (Terminals tr :terminal)
	{
	if(tr.getName().equals(name))
	{
	System.out.println("the Current number is "+tr.getNumber());
	tr.setNumber(newNumber);
	System.out.println("the updated number is "+tr.getNumber());
	}
	else
	{
		throw new TerminalNotFoundException(name);
	}
	}
	return isTerminalNumberUpdated;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
























