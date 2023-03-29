package com.xworkz.train;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

@Bean(name="train")
public Train getTrain()
{
	Train tr =new Train();
	tr.setId(1);
	tr.setName("express");
	tr.setLocation("mysuru");
	return tr;
}
@Bean(name="train1")
public Train getTrain1()
{
	Train tr =new Train();
	tr.setId(1);
	tr.setName("express");
	tr.setLocation("mysuru");
	return tr;
}
@Bean(name="train2")
public Train getTrain2()
{
	Train tr =new Train();
	tr.setId(2);
	tr.setName("express");
	tr.setLocation("mandya");
	return tr;
}
@Bean(name="train3")
public Train getTrain3()
{
	Train tr =new Train();
	tr.setId(3);
	tr.setName("express");
	tr.setLocation("banglore");
	return tr;
}
@Bean(name="train4")
public Train getTrain4()
{
	Train tr =new Train();
	tr.setId(5);
	tr.setName("express");
	tr.setLocation("manglore");
	return tr;
}





}
