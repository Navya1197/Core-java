
package com.xworkz.hospital;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Patient {
	public Patient()
	{
		
	}
	
	private int patientId;
	private String patientName;
	private String patientBloodGroup;
	private String patientGender;
	private int patientAge;
	
}
	
	


