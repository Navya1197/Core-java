package com.xworkz.bank;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size");
		int size =sc.nextInt();
		Bank b =new SBIBank();//upcasting
		SBIBank sbi = (SBIBank) b;//downcasting
		for(int i=0;i<size;i++)
		{
			Customer cst =new Customer("navya","mysuru");
			System.out.println("enter the name");
			String name =sc.next();
			System.out.println("enter the location");
			String location =sc.next();
			System.out.println(cst);
		}
		System.out.println("enter 1 to fetch the data");
		System.out.println("enter the 2 to fetch by name");
		System.out.println("entre the 3 to fetch the by location");
		
		int option =sc.nextInt();
		switch(option)
		{
		case 1: b.getCustomer()	;
		break;
		case 2 : System.out.println("enter  2 to fetch by name");
		String name =sc.next();
		b.getCustomerByGetCustomerName(name);
		

	}


	}
}
