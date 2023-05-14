package com.xworkz.collection1app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListTester {

public static void main(String[] args) {
			
		List<Customer> cust = new ArrayList<Customer>();
		cust.add(new Customer(2, "navya","mysuru", 1233445l, "navya1234@gmail.com"));
		cust.add(new Customer(3, "sheelu","bangore",13456l,"sheelu@gmail.com"));
		cust.add(new Customer(1, "kshema","manglore",12456l,"kshema@gmail.com"));
		cust.add(new Customer(6, "bhavana","udupi",188768l,"Bhavana@gmail.com"));
		cust.add(new Customer(4, "laxmi","mandya",187999l,"laxmi@gmail.com"));
		
		Collections.sort(cust);
		Iterator<Customer> itr = cust.iterator();
		 
		while(itr.hasNext())
		{
		  Customer cust1  = itr.next();
		  System.out.println(cust1);
		}
		 
		}
		}
