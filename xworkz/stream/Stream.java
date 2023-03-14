package com.xworkz.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

public static void main(String[] args) {
List<Integer> list =new ArrayList<Integer>();
   list.add(23);
   list.add(34);
   list.add(56);
   list.add(56);
   list.add(125);
   list.add(657);
   list.add(5567);
   list.add(876);
   list.add(536);
   list.add(788);
   list.add(46);
   list.add(77);
   list.add(456);
   list.add(434);
   list.add(567);
   list.add(899);
   list.add(344);
   list.add(4245);
   list.add(453);
   list.add(23);
   System.out.println(list);
   System.out.println("used by iterator for fetching the data");
   Iterator<Integer> itr =  list.iterator();
   while(itr.hasNext())
   {
	Integer intgr=   itr.next();
	System.out.println(intgr);
   }
  
   System.out.println("used by stream for fetching the data");
   list.stream().forEach(intgr ->System.out.println(intgr));
   //System.out.println("fiter the even number by using even condition");
   /*if(intgr%2==0)
   {
	  System.out.println(intgr); 
   }*/
   System.out.println("filter the even number by using stream");
   List<Integer>evenNumbers=list.stream().filter(intgr->(intgr%2==0)).collect(Collectors.toList());
  System.out.println(evenNumbers);
  System.out.println("filter the morethan 100 by using stream ");
  List<Integer>moreThanHundred=list.stream().filter(intgr->(intgr>100)).collect(Collectors.toList());
  System.out.println(moreThanHundred);
  System.out.println("filter the less than 100 by using stream");
  List<Integer>lessThanHundred=list.stream().filter(intgr->(intgr<100)).collect(Collectors.toList());
  System.out.println(lessThanHundred);
   
   //System.out.println("useb by stream");
   /*if(intgr%2==0)
   {
	 System.out.println(intgr);  
   }*/
   
   
   
  // List<Integer>listOfElements=
	
   }

}


	
	






