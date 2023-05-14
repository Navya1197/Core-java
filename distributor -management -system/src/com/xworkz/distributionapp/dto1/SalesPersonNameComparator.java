package com.xworkz.distributionapp.dto1;

import java.util.Comparator;

import com.xworkz.distributionapp.dto.SalesPersonDTO;



public class SalesPersonNameComparator implements Comparator<SalesPersonDTO> {

	@Override
	public int compare(SalesPersonDTO o1, SalesPersonDTO o2) {
		
	 return o1.getName().compareTo(o2.getName());
	}

}
