package com.xworkz.confi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.client.Client;
import com.xworkz.company.Company;

@Configuration
@ComponentScan(basePackages = "com.xworkz.client")
public class Confi {
@Bean
public List<Client> getClient()
{
	ArrayList<Client> clt =new ArrayList<Client>();
	
	clt.add(new Client(1,"wipro"));
	clt.add(new Client(2,"infosys"));
	clt.add(new Client(3,"dxc"));
	
	
	return clt;


}
}



