package com.xworkz.theatre;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import com.xworkz.theatre.Comparator1.NameComparator;
import com.xworkz.theatre.exception.ScreenNotFoundException;
import com.xworkz.theatre.screen.Screen;
import com.xworkz.theatre.theatre.Theatre;

public class TheatreTester {

	public static void main(String args[])
	{
	System.out.println("main method is started");
	Scanner scanner =new Scanner(System.in);
	BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the size");
	int size =scanner.nextInt();
	Theatre screen = new Theatre(size);
	for(int i=0;i<size;i++)
	{
	System.out.println("enter the screen name");
	String name =scanner.next();
	System.out.println("enter the screen city");
	String city =scanner.next();
	System.out.println("enter the screen id");
	int id =scanner.nextInt();
	
    Screen sn = new Screen(name,city,id);
    //Sop replaces by both or 1
    System.out.println(sn);
    System.out.println(sn.toString());
	
	//Screen sn1 = new Screen(name1,city1,id1);
	//Screen sn2 = new Screen("b6","banglore",7);
	
	screen.fetch(sn);
	
	//screen.fetch(sn1);
	//screen.fetch(sn2);
	}
	List<Screen> list =new ArrayList<Screen>();
	list.sort(new NameComparator());
	screen.getDisplay();
	System.out.println("enter 1 the screen all the terminals");
	System.out.println("enter 2 to fetch screen by Id");
	System.out.println("enter 3 the fetch screen by name");
	System.out.println("enter 4 the fetch screen by city");
	System.out.println("enter 5 the fetch updated screen id by name ");
	int option =scanner.nextInt();
	switch(option)
	{
	case 1:screen.getDisplay();
	break;
	case 2:System.out.println("enter the id to be fetched");
	int id =scanner.nextInt();
	screen.getScreenByScreenId(id);
	break;
	case 3: System.out.println("enter the name to be fetched");
	String name =scanner.next();
		try {
			screen.getScreenByScreenName(name);
		} catch (ScreenNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	break;
	case 4: System.out.println("enter the city to be fetched");
	String city =scanner.next();
		try {
			screen.getScreenByScreenCity(city);
		} catch (ScreenNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	break;
	case 5: System.out.println("enter the id to be fetched");
	int id1 =scanner.nextInt();
	System.out.println("enter the name to be fetched");
	String name1 =scanner.next();
		try {
			screen.updateScreenIdByScreenName(id1,name1);
		} catch (ScreenNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(reader!=null)
			{
				System.out.println("finally block is always excuted");
				//reader.close();
			}
		}
	
	
     
	
System.out.println("main method is ended");
//reader.close();
	}
	}
}


















