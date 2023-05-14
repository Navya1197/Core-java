package com.xworkz.distributionapp.dto;

import java.io.Serializable;

import com.xworkz.distributionapp.bloodGroup.BloodGroup;
import com.xworkz.distributionapp.gender.Gender;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SalesPersonDTO  implements Serializable,Comparable<SalesPersonDTO> {
	private Integer id;
	private String name;
	private String Adress;
	private Gender gender;
	private Integer age;
	private Long phnNumber;
	private BloodGroup bloodGroup;
	@Override
	public int compareTo(SalesPersonDTO o) {
		// TODO Auto-generated method stub
		return o.id-o.id;
	}
	
	/*@Override
	public int hashCode()
	{
		return id;
	}
	
	
	@Override
	public int compareTo(SalesPersonDTO o) {
		// TODO Auto-generated method stub
		return this.hashCode()-o.hashCode();
	}*/
	
	}
	
	
	



