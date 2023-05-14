package com.xworkz.distributionapp.distributor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.xworkz.distributionapp.dto.SalesPersonDTO;
import com.xworkz.distributionapp.dto1.AgeComparator;
import com.xworkz.distributionapp.dto1.SalesPersonNameComparator;

public class DistributorImpl implements Distributor{

	List<SalesPersonDTO> salesPerson;
	public DistributorImpl() {
		
	salesPerson= new ArrayList<SalesPersonDTO>();
	}
	
	
	@Override
	public boolean addSalesPerson(SalesPersonDTO dto) throws Exception {
		
		List<SalesPersonDTO> list =new ArrayList<SalesPersonDTO>();
		System.out.println("inside addsalesperson() with salespersonDTO as a parameter");
		boolean isAdded =false;
		if(dto!=null && dto.getId()>=1 && dto.getName()!=null)
		{
	      salesPerson.add(dto);
		System.out.println("sales person data addded succesfully");
		   isAdded= true;
	}
		else
		{
			System.out.println("sales person data not added succesfully");
		}
		return false;
	}
	



	@Override
	public List<SalesPersonDTO> getAllSalesPerson() {
		List<SalesPersonDTO> dt =new ArrayList<SalesPersonDTO>();
		Collections.sort(salesPerson,new AgeComparator());
		Collections.sort(salesPerson,new SalesPersonNameComparator());
		Iterator<SalesPersonDTO> itr =salesPerson.iterator();
		while(itr.hasNext())
		{
			dt.add(itr.next());
			//System.out.println(dt);
		
	}
		System.out.println(dt);
		System.out.println("get salesperson method ended");
		return dt;
		//Collections.sort(salesPerson);
		
	
		 

}
}




