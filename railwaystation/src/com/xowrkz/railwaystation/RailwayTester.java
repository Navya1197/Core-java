package com.xowrkz.railwaystation;

import java.util.Scanner;

import com.xowrkz.railwaystation.platform.Platform;
import com.xowrkz.railwaystation.railwaystation.RailwayStation;

public class RailwayTester {

	public static void main(String args[])
    {
	System.out.println("main method is started");
	Scanner scanner =new Scanner(System.in);
	System.out.println("enter the size");
	int size = scanner.nextInt();
	RailwayStation station =new RailwayStation(size);
	for(int i=0;i<size; i++)
	{
	System.out.println("enter the name");
	String name =scanner.next();
	System.out.println("enter the city ");
	String city =scanner.next();
	System.out.println("enter the id");
	int id =scanner.nextInt();
	System.out.println("enter the name");
	String name1 =scanner.next();
	System.out.println("enter the city ");
	String city1 =scanner.next();
	System.out.println("enter the id");
	int id1 =scanner.nextInt();
	//RailwayStation station = new RailwayStation();
	Platform pt = new Platform(name,city,id);
	Platform pt1 = new Platform(name1,city1,id1);
	//Platform pt2 = new Platform("3","mysuru",85); 
	
	station.fetch(pt);
	station.fetch(pt1);
	}
	//station.fetch(pt2);
	station.getDisplay();
	System.out.println("main method is ended");
    scanner.close();

}
}














