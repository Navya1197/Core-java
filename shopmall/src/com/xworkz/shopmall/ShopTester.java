package com.xworkz.shopmall;

import java.util.Scanner;

import com.xworkz.shopmall.shop.Shop;
import com.xworkz.shopmall.shopmall.ShopMall;

import exception.CustomerNotFoundException;

public class ShopTester {
	public static void main(String nav[]) 
	{
	System.out.println("main method is started");
	Scanner scanner =new Scanner(System.in);
	System.out.println("enter the size");
	int size =scanner.nextInt();
	ShopMall mall = new ShopMall(size);
	for(int i=0;i<size;i++)
	{
	System.out.println("enter the name");
	String name =scanner.next();
	System.out.println("enter the city");
	String city =scanner.next();
	System.out.println("enter the id");
	int id =scanner.nextInt();
	Shop sn = new Shop(name,city,id);
	mall.fetch(sn);
	System.out.println(sn);
	}
	/*mall.getDisplay();
	mall.getShopByShopId(1);

   mall.getshopByshopName("navya");
    mall.getShopByShopCity("mysuru");
    mall.updateShopIdByShopName(1 ,"navya");*/
		
	
	//mall.getShopByShopCity("mysuru");
	//mall.updateShopIdByShopName(1 ,"navya");
	
	 System.out.println("enter 1 the mall all the shops");
	
	
	System.out.println("enter 2 to fetch shop by Id");
	System.out.println("enter 3 the fetch shop by name");
	System.out.println("enter 4 the fetch shop by city");
	System.out.println("enter the 5 fetch updated id by name");
	
	/*try {
		mall.getshopByshopName("navya");
		mall.getShopByShopCity("mysuru");
	    mall.updateShopIdByShopName(1 ,"navya");
		
		
	} catch (CustomerNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   // mall.getShopByShopCity("mysuru");
   // mall.updateShopIdByShopName(1 ,"navya");*/
	
	int option =scanner.nextInt();
	switch(option)
	{
	case 1:mall.getDisplay();
	break;
	case 2:System.out.println("enter the id to be fetched");
	int id =scanner.nextInt();
	mall.getShopByShopId(id);
	break;
	case 3: System.out.println("enter the name to be fetched");
	String name =scanner.next();
		try {
			mall.getshopByshopName(name);
		} catch (CustomerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	break;
	case 4: System.out.println("enter the city to be fetched");
	String city =scanner.next();
		try {
			mall.getShopByShopCity(city);
		} catch (CustomerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	break;
    case 5:System.out.println("enter the id to be fetched");
	int id1 =scanner.nextInt();
	System.out.println(" enter the name to be fetched");
	String name1 = scanner.next();	
		try {
			mall.updateShopIdByShopName(id1, name1);
		} catch (CustomerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(scanner!=null)
			{
				scanner.close();
				System.out.println(" finally block is always executed");
			}
		}
	System.out.println("main method is ended");
		
		}

		}
	}















