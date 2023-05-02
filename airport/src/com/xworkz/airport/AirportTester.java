package com.xworkz.airport;

import java.util.Scanner;

import com.xoworkz.airport.airport.Airport;
import com.xoworkz.airport.exception.TerminalNotFoundException;
import com.xoworkz.airport.terminal.Terminals;
public class AirportTester
{
	public static void main(String args[])
	{
	/*System.out.println(terminal);
	System.out.println(terminal.toString());*/
	System.out.println("main method is started");
	Scanner scanner =new Scanner(System.in);
	/*BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));*/
	System.out.println("enter the size");
	int size =scanner.nextInt();
	Airport air = new Airport(size); 
	for(int i=0;i<size;i++)
	{
	System.out.println("enter the id of the terminal");
	int id = scanner.nextInt();
	System.out.println("enter the terminal name");
	String name = scanner.next();
	System.out.println("enter the number of the terminal");
	int number=scanner.nextInt();
	Terminals terminal = new Terminals(id, name, number);
	air.fetch(terminal);
	}
	
	/*air.getTerminals();
	try {
		air.getTerminalByTerminalName("navya");
		
		air.updateTerminalNumberByTerminalName(123,"navya");
	} catch (TerminalNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	air.getTerminalByTerminalNumber(1);*/
	//air.updateTerminalNumberByTerminalName(123,"navya");
	
	try
	{
	System.out.println("enter 1 the fetch all the terminals");
	System.out.println("enter 2 to fetch terminal by Id");
	System.out.println("enter 3 the fetch terminal by name");
	System.out.println("enter 4 the fetch terminal by number");
	System.out.println("enter 5 the fetch updated terminal ");
	int  option =scanner.nextInt();
	switch(option)
	{
	case 1:air.getTerminals();
	break;
	case 2:System.out.println("enter the id to be fetched");
	int id=scanner.nextInt();
	air.getTerminalByTerminalId(id);
	break;
	case 3: System.out.println("enter the name to be fetched");
	String name =scanner.next();
	air.getTerminalByTerminalName(name);
	break;
	case 4: System.out.println("enter the number to be fetched");
	int number =scanner.nextInt();
	air.getTerminalByTerminalNumber(number);
	break;
	case 5:System.out.println(" enter the updated number");
	int updatedNumber=scanner.nextInt();
	System.out.println("enter the name");
	String name1 =scanner.next();
	air.updateTerminalNumberByTerminalName(updatedNumber,name1);
	break;	
	}
	}
	
		catch(TerminalNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
	


	/*finally
	{
	if(scanner!=null)
	{
	System.out.println(" finally block is always executed");	
	}*/
		
	//System.out.println("main method is ended");






	
	

	





















