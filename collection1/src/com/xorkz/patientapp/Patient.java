package com.xorkz.patientapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Patient implements Comparable<Patient> {
	
public Patient()
{
	
}
	
private String name;
private int id;
private String location;
private long PhnNumber;
private String email;
@Override
public int compareTo(Patient o) {
	// TODO Auto-generated method stub
	return this.id-o.id;
}
}

