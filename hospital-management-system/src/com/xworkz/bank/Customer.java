package com.xworkz.bank;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Customer {

String name;
String location;

public String toString()
{
	return "Customer  =(name ="+this.name+",location ="+this.location+")";

}
}
