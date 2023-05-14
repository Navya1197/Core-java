package com.xworkz.collection;

import java.util.ArrayList;
import java.util.List;

public class ListAddAll {

	public static void main(String[] args) {
		

	List list =new ArrayList();
	list.add("navya");
	list.add("sheelu");
	list.add("nikki");
	
	List lst =new ArrayList();
	lst.add("pooja");
	lst.add("baba");
	lst.add("akshi");
	
	 
	
	System.out.println(list.addAll(lst));
	System.out.println(list);
	System.out.println(lst.addAll(1,list));
	System.out.println(lst);
	System.out.println(lst.removeAll(list));
	System.out.println(lst);
	
	
	
	
	
	}

}
