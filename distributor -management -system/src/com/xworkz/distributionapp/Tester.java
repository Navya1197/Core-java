package com.xworkz.distributionapp;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.xworkz.distributionapp.bloodGroup.BloodGroup;
import com.xworkz.distributionapp.distributor.Distributor;
import com.xworkz.distributionapp.distributor.DistributorImpl;
import com.xworkz.distributionapp.dto.SalesPersonDTO;
import com.xworkz.distributionapp.dto1.SalesPersonNameComparator;
import com.xworkz.distributionapp.gender.Gender;

public class Tester {

	public static void main(String args[])
	{
		//abstraction
		
		
		
		
		Scanner sc=null;
		try {
		Distributor dst= new DistributorImpl();
		
	    sc =new Scanner(System.in);
		//SalesPersonDTO dto = new SalesPersonDTO();
		
		//System.out.println("enter the size");
		//int size =sc.nextInt();
	    /*List<SalesPersonDTO> list = new ArrayList<SalesPersonDTO>();
	    SalesPersonNameComparator sales =new SalesPersonNameComparator();
		Collections.sort(list, sales);
		for(SalesPersonDTO sle: list)
			System.out.println(sle.getName());*/
		
		for(int i=0;i<2;i++)
		{	
		//SalesPersonComparator sale =new SalesPersonComparator();
		SalesPersonDTO dto = new SalesPersonDTO();
		System.out.println("enter the id");
	    dto.setId(sc.nextInt());
	     System.out.println("enter the name");
		dto.setName(sc.next());
		System.out.println("enter the address");
		dto.setAdress(sc.next());
		System.out.println("enter the gender");
		dto.setGender(Gender.valueOf(sc.next()));
		System.out.println("enter the age");
		dto.setAge(sc.nextInt());
		System.out.println("enter the phonenumber");
		dto.setPhnNumber(sc.nextLong());
		System.out.println("enter the bloodgroup");
		dto.setBloodGroup(BloodGroup.valueOf(sc.next()));
		dst.addSalesPerson(dto);
		dst.getAllSalesPerson();
		//System.out.println(dto);
		//sale.compare(dto,dto);
		//dto.hashCode();
		dto.compareTo(dto);
		//List list = new ArrayList<SalesPersonDTO>();
		//SalesPersonNameComparator sales =new SalesPersonNameComparator();
		//Collections.sort(list, sales);
		
		}
		}

	
		
   
		
		catch(Exception e)
		{
	     e.printStackTrace();
		}
		finally {
			if(sc!=null)
			{
				System.out.println("finally block is executed");
			}
		}
		}


	}





