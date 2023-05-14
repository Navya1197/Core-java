package com.xworkz.terminal;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTester {

public static void main(String[] args) {
	
	List<Terminal> list =new LinkedList<Terminal>();
	
	list.add(new Terminal("mysure ",1,123));
	list.add(new Terminal("banglore",2,1256));
	list.add(new Terminal("manglore",3,1232535));
	list.add(new Terminal("mandya",4,14234));
	list.add(new Terminal("ramnagar",5,663335));
	Iterator<Terminal> itr =list.iterator();
	while(itr.hasNext())
	{
		Terminal tr =itr.next();
		System.out.println(tr);
	}
	
	
} 




}
