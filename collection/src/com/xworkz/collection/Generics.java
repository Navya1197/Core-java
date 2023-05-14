package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;

public class Generics {

public static void main(String args[])
{
	List<String> list =new ArrayList<String>();
	list.add("navya");
	list.add("sheelu");
	System.out.println(list);
	
	System.out.println("after fetching data using iterator");
	Iterator itr = list.iterator();
	while(itr.hasNext())
	{
		Object obj =itr.next();
		System.out.println(obj);
	}
	
	List<Integer> list1 = new LinkedList<Integer>();
	list1.add(1);
	list1.add(3);
	list1.add(2);
	list1.add(8);
	list1.add(7);
	//System.out.println(list1);
	Iterator itr1 =list1.iterator();
	while(itr1.hasNext())
	{
		Object obj = itr1.next();
		System.out.println(obj);
	}
	
	List<String> lst= new Vector<String>();
	lst.add("kshema");
	lst.add("navya");
	lst.add("laxmi");
	lst.add("bhavana");
	//System.out.println(lst);
	Iterator itr2 =lst.iterator();
	while(itr2.hasNext())
	{
		Object obj1= itr2.next();
		System.out.println(obj1);
	}
	
	Queue<Long> q= new PriorityQueue<Long>();
	q.add(123l);
	q.add(345l);
	q.add(4566l);
	System.out.println(q);
	
	
	
	  }
}

