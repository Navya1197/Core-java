package com.xworkz.hospital;

import java.util.Scanner;

public class HospitalTester
    {
	public static void main(String args[])
	{	
	System.out.println("main method is stated");
	Scanner scanner= new Scanner(System.in);
	System.out.println("enter the size");
	int size = scanner.nextInt();
	//upcasting
	Hospital  hsptl = new ApolloHospital(size);
	
	//downcasting
	ApolloHospital ApolloHospital = (ApolloHospital) hsptl;
	
	for(int i=0;i<size;i++)
	{
		Patient pt =new Patient();
	System.out.println("enter the patientId");
	pt.setPatientId(scanner.nextInt());
	System.out.println("enter the patient name");
	pt.setPatientName(scanner.next());
	System.out.println("enter the patient bloodGroup");
	pt.setPatientBloodGroup(scanner.next());
	System.out.println("enter the patient gender");
	pt.setPatientGender(scanner.next());
	System.out.println("enter the patient age");
	pt.setPatientAge(scanner.nextInt()); 
	 
	System.out.println(pt.getPatientId()+" "+pt.getPatientName()+" "+pt.getPatientBloodGroup()+" "+pt.getPatientGender()+" "+pt.getPatientAge());
	hsptl.admit(pt);
	hsptl.getPatients();
	ApolloHospital.Canteen();
	
	String value="yes"; 
	int option;
	 //int userInput=0;
	do
	{
	System.out.println("enter the 1 to fetch all the patients");
	System.out.println("enter the 2 to fetch patients By id");
	System.out.println("enter the 3 to update patient age by patient id");
	System.out.println("enter the 4 to fetch patients by name ");
	System.out.println("enter the 5 to fetch patients by gender");
	System.out.println(" enter the 6 to fetch patients by bloodgroup");
	//System.out.println("enter the 7 to exit");
	//System.out.println("enter the 8 to exit");
	//System.out.println("enter the 7  to exit ");
	option =scanner.nextInt();
	switch(option)
	{
		case 1: hsptl.getPatients();
		break;
		case 2:System.out.println("enter the patient id");
		int id =scanner.nextInt();
		hsptl.getPatientByPatientId(id);
		break;
		case 3:System.out.println("enter the updated age");
		int updatedAge=scanner.nextInt();
		System.out.println("enter the patient id");
		int patientId =scanner.nextInt();
		hsptl.updatePatientAgeByPatientId(updatedAge,patientId);
		break;
		case 4:System.out.println("enter the patient name");
		String name =scanner.next();
		hsptl.getPatientByPatientName(name);
		break;
		case 5:System.out.println("enter the patient gender");
		String gender =scanner.next();
		hsptl.getPatientByPatientGender(gender);
		break;
		case 6:System.out.println("enter the patient bloodgroup");
		String bloodGroup=scanner.next();
		hsptl.getPatientByPatientBloodGroup(bloodGroup);
		break;
		default:System.out.println(" please enter the valid number");
		break;
		
		
		//case 8:System.out.println("thank you");
		//scanner.nextInt();
	
		}
	System.out.println("do you want to yes or no");
	 //userInput =scanner.nextInt();
	}
	while(value.equals(scanner.next()));
	System.out.println("thank you visiting us");
	
	
	//scanner.close();
	}
	
	scanner.close();
	}
	}
    
    

	
	
	
	
	
	
	
	
	
	
	
    
	