package com.xworkz.hospital;

public class Hospital {

	//polymorphism
	
	Patient patient[] = new Patient[3];  
	int index;
	public Hospital()
	{
	System.out.println("Hospital object is created");
	}
	//Patient patient[]=new Patient[size]
	//String str ={"nav","putta"};if you know about patient name means members name, when that time you have to use this type 
	//Datatype variable[] = new Datatype[size]
	//String str = new String[4]; if you know about only noofpatients means no of members ,when that time you have to use this type 
	//public Apollo()
	//{
	//System.out.println("Apollo object is created");	
	//}
	public boolean admit(Patient patient)
	{
	System.out.println("Admit process is started");
	boolean isAdmitted = false;//  intialy
	if(patient.getPatientName()!= null)//null is a default value so we have used null 
	{
	this.patient[index++] =patient;
	 isAdmitted =true;
	}
	else
	{
	this.patient[index++]= patient;
	isAdmitted =false;  	
	}
	System.out.println("Admit process is ended");
	return isAdmitted; 
	}
	public void getPatients()
	{
	System.out.println("list of patients are");
	for(Patient pt:patient)

	{
		System.out.println(pt);
	}
	}
	public  Patient getPatientByPatientId(int patientId)
	{
	System.out.println("Inside get Patient by patient id method"); 
	for(Patient pt:patient)
	{
	if(pt.getPatientId() ==patientId)
	{
	System.out.println("patient id is matching...proceed");
	System.out.println(pt);
	return  pt;
	}
	System.out.println("end of the get patient id mathod");
	}
	return null ;
	}
	public  Patient getPatientByPatientName(String patientName)
	{
	System.out.println("Inside get Patient by patient name method");
	for(Patient pt: patient )
	{
	if(pt.getPatientName().equals(patientName))
	{
	System.out.println("patient name is matching...proceed");
	System.out.println(pt);
	return  pt;
	}
	System.out.println("end of the get patient name mathod");
	}
	return null;
	}
	public  Patient getPatientByPatientGender(String patientGender)
	{
	System.out.println("Inside get Patient by patient gender method");
	for(int in=0; in<patient.length; in++)
	{
	if(patient[in].getPatientGender() ==patientGender)
	{
	System.out.println("patient gender is matching...proceed");
	System.out.println(patient[in].getPatientId()+" "+patient[in].getPatientName()+"   "+patient[in].getPatientGender()+" "+patient[in].getPatientAge());
	return  patient[in];
	}
	System.out.println("end of the get patient gender mathod");
	}
	return null;
	}
    
public  Patient getPatientByPatientBloodGroup(String patientBloodGroup)
{
System.out.println("Inside get Patient by patient gender method");
for(int in=0; in<patient.length; in++)
{
if(patient[in].getPatientBloodGroup() ==patientBloodGroup)
{
System.out.println("patient BloodGroup is matching...proceed");
System.out.println(patient[in].getPatientId()+" "+patient[in].getPatientName()+"   "+patient[in].getPatientGender()+" "+patient[in].getPatientAge());
return  patient[in];
}
System.out.println("end of the get patient BloodGroup mathod");
}
return null;
}
public  Patient getPatientByPatientAge(int patientAge)
{
System.out.println("Inside get Patient by patient age method");
for(int in=0; in<patient.length; in++)
{
if(patient[in].getPatientAge() == patientAge)
{
System.out.println("patient age is matching...proceed");
System.out.println(patient[in].getPatientId()+" "+patient[in].getPatientName()+"   "+patient[in].getPatientGender()+" "+patient[in].getPatientAge());
return  patient[in];
}
System.out.println("end of the get patient age mathod");
}
return null;
}
public boolean updatePatientAgeByPatientId(int newAge,int patientId)
{
boolean isAgeUpdated = false;
System.out.println("updated PatientAgeByPatientId started");
for (int i= 0; i< patient.length; i++)
{
if(patient[i].getPatientId() == patientId)
{
System.out.println("the Current Age is "+patient[i].getPatientAge());
patient[i].setPatientAge(newAge);
System.out.println("the updated Age is "+patient[i].getPatientAge());
}
}
return isAgeUpdated;
}
public void getPatientAll()
{
System.out.println("list of patients are");
for(index =0; index<this.patient.length; index++)
{
System.out.println(patient[index].getPatientId()+" " +patient[index].getPatientName()+"  "+patient[index].getPatientBloodGroup()+" "+patient[index].getPatientGender()+""+patient[index].getPatientAge());               
System.out.println(this.patient[index]);
}
}
}

//public void getPatientAl()
//{
//System.out.println("list of patients are");
//for(index =0; index<this.patient.length; index++)
//{
//System.out.println(patient[index].patientId+" " +patient[index].patientName+"  "+patient[index].patientBloodGroup+" "+patient[index].patientGender+""+patient[index].patientAge);               
//System.out.println(this.patient[index]);
//}
//}

















	



	
	

	
	
	







