package com.xworkz.bank;

public class Bank {

Customer[] cst =new Customer[1];
int index;
public Bank()
{
	System.out.println("object is created");
	
}
public boolean saveCustomer(Customer cst)
{
	boolean isSaveCustomer =false;
	if(cst.name!=null)
	{
		this.cst[index++]= cst;
		isSaveCustomer =true;
	}
	return isSaveCustomer;
	
}
public void getCustomer()
{
	for(int i=0;i<this.cst.length;i++)
	{
		System.out.println(cst[i]);
	}
}
public boolean getCustomerByGetCustomerName( String name)
{
for(int i=0;i<cst.length;i++)	
{
if(cst[i].name==name)
{
	System.out.println(cst[i]);
	
}
}
return false;
}


}
