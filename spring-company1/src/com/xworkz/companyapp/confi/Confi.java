package com.xworkz.companyapp.confi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import com.xworkz.companyapp.client.Client;
import com.xworkz.companyapp.company.Company;

@Configuration
@ComponentScan(basePackages = "com.xworkz.companyapp")


public class Confi {


@Bean
public Company getCompany()
{
	Company cm= new Company();
			return cm;

}
}
