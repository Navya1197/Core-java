package com.xworkz.foodStall;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

@Bean
public Seller getAll()
{
Seller  sale =new Seller();
sale.setId(1);
sale.setName("aarush");
sale.setPlace("mysuru");
return sale;
}




}
