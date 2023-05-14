package com.xworkz.springappp1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xworkz.springApp.Person;

@Configuration
public class SpringConfiguration {

@Bean(name="person")
public Person getPerson()
{
Person per =new Person();
per.setId(1);
per.setName("nav");
return per;
}
@Bean(name="person1")
public Person getPerson1()
{
	Person per =new Person();
	per.setId(2);
	per.setName("kavya");
	return per;
	
}

@Bean(name="person2")
public Person getPerson2()
{
Person per =new Person();
per.setId(1);
per.setName("nav");
return per;
}
@Bean(name="person3")
public Person getPerson3()
{
Person per =new Person();
per.setId(1);
per.setName("nav");
return per;
}
@Bean(name="person4")
public Person getPerson4()
{
Person per =new Person();
per.setId(1);
per.setName("nav");
return per;
}




}
