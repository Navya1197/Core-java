package com.xworkz.shop.shop;

public class Shop {

public Shop()
{
	
}

private String name;
private String city;
private int id;

public Shop(String name,String city,int id)
{
this.name =name;
this.city =city;
this.id=id;
}
public  void setShopName(String name)
{
this.name =name;
}
public String getShopName()
{
	return name;
}
public void setShopCity(String city)
{
	this.city =city;
}
public String getShopCity()
{
	return city;
}

public void setShopId(int id)
{
	this.id =id;
}
public int getShopId()
{
	
	return id;
	
}



}
