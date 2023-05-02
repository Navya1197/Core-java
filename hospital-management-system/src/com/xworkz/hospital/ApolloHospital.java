package com.xworkz.hospital;

public class ApolloHospital extends Hospital {

boolean isApplicationFormFilled=false; 
public ApolloHospital(int size)
{
patient = new Patient[size];
System.out.println("apollo hospital object is created");

}
//method override
 @Override
public boolean admit(Patient patient)
{
System.out.println("inside add patient hospital");
if(isApplicationFormFilled==true)
{
	System.out.println("application form is filled");
	super.admit(patient);//return isAdmitted;
}
	 

return false;
}
 
 public String Canteen()
 {
	 System.out.println("canteen object");
 return  "good"  ;
 }
}

 
















