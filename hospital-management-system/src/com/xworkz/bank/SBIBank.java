package com.xworkz.bank;

public class SBIBank extends Bank{

boolean isApplicationFormFilled =false;
Customer[] cst =new Customer[1];
public SBIBank()
{
	System.out.println("object 2 is created");
}


@Override
public boolean saveCustomer(Customer cst)


{
	if(isApplicationFormFilled==true)
	{
		System.out.println("isapplicatuon form is filled");
		super.saveCustomer(cst);
	}
	return isApplicationFormFilled;
}





}
