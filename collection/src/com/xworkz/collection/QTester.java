package com.xworkz.collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QTester {

public static void main(String args[]) {
	
Queue set =new PriorityQueue();

set.add("laxmi");
set.add("baanu");
set.add("krish");
//set.add(null);//Queue is not accept the null value

System.out.println(set);
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
	//System.out.println(data);
	itr.remove();
}
System.out.println(set);
}



}
