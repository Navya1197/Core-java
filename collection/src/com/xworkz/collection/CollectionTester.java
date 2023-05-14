package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.print.attribute.SetOfIntegerSyntax;

public class CollectionTester {

public static void main(String args[])

/*{
	Object[] obj = {"navya", 25,"laxmi","bhavana","kshema"};
	
//collection framework

/*for(Object ob :obj)
{
	System.out.println(ob);
}*/

{
 Collection list = new ArrayList();
 list.add(30);
 list.add("laxmi");
 list.add("pooja");
 list.add("kshema");
 list.add("bhavana");
 list.add("navya");
 list.add("gagana");
 list.add('a');
 list.add(45);
 list.add(67);
 list.add("poorni");
 list.add("shree");
 list.add(56.8d);
 list.add(212343l);
 list.add(46665897l); 
 list.add(6.4f);
 list.add(23.7f);
 list.add(224455l);
 list.add('b');
 list.add('h');
 list.add('g');
 list.add(12343422l);
 list.add("shiva");
 list.add("768.8d");
 list.add('c');
 list.add("india");
 list.add("karnataka");
 list.add(" mysuru");
 list.add("mtech");
 list.add("vtu");
 list.add("decs");
 list.add('t');
 list.add("rajajinagar");
 System.out.println(list.size());
System.out.println(list.contains("laxmi"));
 System.out.println(list);
 System.out.println(list.remove("laxmi"));
 //System.out.println(list.isEmpty());
 System.out.println(list.equals("navya"));
 System.out.println(list.equals("poorni"));
 
 System.out.println(list);
 System.out.println("fetching the data using iterator");
 Iterator itr = list.iterator();
 while(itr.hasNext())
 {
	 Object obj =itr.next();
	 //System.out.println(obj);
	 itr.remove();
	 System.out.println(list);
 }
 
// System.out.println(list);
}






}
