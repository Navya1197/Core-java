package com.xworkz.collection1app;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Customer implements Comparable<Customer> {


private int id;
private String name;
private String location;
private long phoneNumber;
private  String email;

@Override
public int compareTo(Customer o) {
	// TODO Auto-generated method stub
	return this.id-o.id;
}

	
}
