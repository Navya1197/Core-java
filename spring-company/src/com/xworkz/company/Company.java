package com.xworkz.company;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.xworkz.client.Client;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;




@ToString
@Component
@Getter
@Setter
@Configuration


public class Company {

 @Autowired
private List<Client> client;

@Bean
 public void print()
{
	System.out.println(this.getClass().getSimpleName()+"  object is created");
}

}
