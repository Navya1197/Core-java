package com.xworkz.shopmall.shopmall;

import com.xworkz.shopmall.shop.Shop;


import exception.CustomerNotFoundException;

public class ShopMall {

	Shop shop[];
	int index;
	public ShopMall(int size)
	{
	System.out.println("Shopping object is created");
	shop =new Shop[size];
	}
	public boolean fetch(Shop shop) 
	{
	System.out.println("mall process is created");	
	boolean isfetching = false;
	if(shop.name != null &&shop.name!=" ")
	{
	this.shop[index++]= shop;
	isfetching = true;
	}
    System.out.println("screen process is ended");
	return isfetching;
	}
	public void getDisplay()
	{
	System.out.println("list of screen are");
	for(index=0;index<this.shop.length; index++)
	{
	System.out.println(shop[index]);                                     
	}
	}
	public  Shop getshopByshopName(String name) throws CustomerNotFoundException
	{
	System.out.println("Inside get shop by shop id method"); 
	for(int in=0; in<shop.length; in++)
	{
	if(shop[in].name.equals(name))
	{
	System.out.println("screen name is matching...proceed");
	System.out.println(shop[in]);
	return shop[in];
	}
	throw new CustomerNotFoundException(name);
	}
	System.out.println("end of the get shop id mathod");
	
	return null;
	}	
	public  Shop getShopByShopCity(String city) throws CustomerNotFoundException 
	{
	System.out.println("Inside get shop id method"); 
	for(int in=0; in<shop.length; in++)
	{
	if(shop[in].name.equals(city))
	{
	System.out.println("screen city is matching...proceed");
	System.out.println(shop[in]);
	return shop[in];
	}
	else
	{
	throw new CustomerNotFoundException(city);	
	}
	}
	System.out.println("end of the get shop city mathod");
	
	return null;
	}	
	public  Shop getShopByShopId(int shopId)
	{
	System.out.println("Inside get shop id method"); 
	for(int in=0; in<shop.length; in++)
	{
	if(shop[in].id ==shopId)
	{
	System.out.println("screen id is matching...proceed");
	System.out.println(shop[in]);
	return shop[in];
	}
	System.out.println("end of the get shop id mathod");
	}
	return null;
	}
	public boolean updateShopIdByShopName(int newId,String name) throws CustomerNotFoundException 
	{
	boolean isTerminalNumberUpdated = false;
	System.out.println("updated id started");
	for (int i= 0; i< shop.length; i++)
	{
	if(shop[i].name.equals(name))
	{
	System.out.println("the Current number is "+shop[i].id);
	shop[i].id=(newId);
	System.out.println("the updated number is "+shop[i].id);
	}
	//return isTerminalNumberUpdated;
	else
{
	throw new CustomerNotFoundException(name);
}
	}
	return isTerminalNumberUpdated;
}
}
	






































