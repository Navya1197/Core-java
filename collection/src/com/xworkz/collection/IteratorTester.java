package com.xworkz.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorTester {

public static void main(String args[])
{
	
	Set set =new HashSet();
	set.add("zebra");
	set.add("lion");
	
	System.out.println("fetching the data using for each");
	for(Object obj :set)
	{
		System.out.println(obj);
		
	}
	
	System.out.println("fetchig data using iterator");
	Iterator itr =set.iterator();
	while(itr.hasNext())
	{
		//Object data =itr.next();
		String data =(String)itr.next();
		System.out.println(data);
	}
}





}
