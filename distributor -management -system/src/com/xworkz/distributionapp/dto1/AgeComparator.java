package com.xworkz.distributionapp.dto1;

import java.util.Comparator;

import com.xworkz.distributionapp.dto.SalesPersonDTO;

public class AgeComparator implements Comparator<SalesPersonDTO> {

	@Override
	public int compare(SalesPersonDTO o1, SalesPersonDTO o2) {
		
		return o1.getAge()-o2.getAge();
	}

}
