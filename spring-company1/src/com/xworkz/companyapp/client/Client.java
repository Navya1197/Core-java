package com.xworkz.companyapp.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


import lombok.ToString;

@ToString
@Component


public class Client {

	@Value("1")
	private int id;
	@Value("wipro")
	private String name;
}



