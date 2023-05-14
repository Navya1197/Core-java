package com.xworkz.companyapp.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.companyapp.client.Client;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Component


public class Company {

	@Autowired
	private List<Client> client;
	
	public Company()
	{
		System.out.println(this.getClass().getSimpleName()+"  object is created");
	}
	

	}




