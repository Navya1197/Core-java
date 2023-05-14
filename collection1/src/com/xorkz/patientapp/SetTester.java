package com.xorkz.patientapp;


//import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import java.util.Set;
import java.util.TreeSet;

public class SetTester {

public static void main(String args[]) {
	
 Set<Patient> sort= new TreeSet<Patient>();
 sort.add( new Patient("navya",1,"mysuru", 12347l,"navya@gmail.com"));
 sort.add(new Patient("sheelu",2, "banglore",1245l,"sheelu@gmail.com"));
 sort.add(new Patient("bhavana",3, "ramnagar",3346454l,"bhavana@gmail.com"));
 sort.add(new Patient("laxmi",4, "mandya",124234234l,"laxmi@gmail.com"));
 sort.add(new Patient("khsema",5, "udupi",123123l,"kshema@gmail.com"));
 
 
 Iterator<Patient> itr = sort.iterator();
 //Collections.sort(Patient);//for sort in arrraylist
  /*for(Patient obj: sort )
  {
	System.out.println(obj);
	
	  }*/
 
 while(itr.hasNext())
 {
	 Patient pt = itr.next();
	 System.out.println(pt); 
 }






}
}


