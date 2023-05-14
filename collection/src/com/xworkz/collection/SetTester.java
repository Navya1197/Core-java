package com.xworkz.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTester {

	public static void main(String[] args) {
	 
	/*Object Present = new Object();
	Object obj = null;
	System.out.println(Present==obj);*/
		
	Set set  = new  HashSet();
	set.add("navya");
	set.add("sheelu");
	set.add(35);
	set.add(45);
	set.add(67);
	set.add("ranju");
	set.add(null);
	set.add(null);
	set.add("sheelu");
	System.out.println(set);
	
	System.out.println(" fetching data using iterator");
	//set.add("navya");
	//set.add("sheelu");
	Iterator itr =set.iterator();
	while(itr.hasNext())
	{
		Object data =itr.next();
		//System.out.println(data);
		//itr.remove();
		System.out.println(set);
	}
	//System.out.println(set);
	
	Set st =new LinkedHashSet();
	
	st.add("navya");
	st.add("sheelu");
	st.add(35);
	st.add(45);
	st.add(67);
	st.add("ranju");
	st.add(null);
	st.add(null);
	st.add("sheelu");
	System.out.println(st);
	System.out.println("fetching the data using iterator");
	Iterator itr1= st.iterator();
while(itr1.hasNext())
{
	Object obj =itr1.next();
	itr1.remove();
	System.out.println(st);
}
//System.out.println(st);
	

Set set1 =new TreeSet();
	
	set1.add(89); 
	set1.add(98);
	set1.add(23);
	set1.add(78);
	set1.add(64);
	set1.add(null);
	System.out.println(set1);
	System.out.println("fetching the data using iterator");
	Iterator itr2= set1.iterator();
while(itr2.hasNext())
{
	Object obj =itr2.next();
	itr2.remove();
	System.out.println(set1);


	}
//System.out.println(set1);


}
}


