package com.xworkz.shop.shoptester;

import java.util.Scanner;

import com.xworkz.shop.shop.Shop;

public class ShopTester {

public static void main(String args[])
{
	Scanner sc =new Scanner(System.in);
	Shop sh =new Shop();
	System.out.println("enter the shop name");
	sh.setShopName(sc.next());
	System.out.println("enter the shop city");
	sh.setShopCity(sc.next());
	System.out.println("enter the shop id");
	sh.setShopId(sc.nextInt());

sc.close();



}

}
