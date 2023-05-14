package com.xworkz.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.xworkz.address.Address;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

@ToString
@Component

public class Person {
@Value("1")
private int id;
@Value("navya")
private String name;
@Autowired
private Address address;
public Person()
{
	System.out.println("implementation");
	
}
}

