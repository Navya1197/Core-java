package com.xworkz.kitchen;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

@Bean(name="kitchen")
	public Kitchen getKitchen()
    {
	Kitchen kit =new Kitchen();
	 kit.setId(1);
	 kit.setName("glass");
	 kit.setLocation("mysuru");
	return kit;
	
}
@Bean(name="kitchen1")
public Kitchen getKitchen1()
{
Kitchen kit =new Kitchen();
 kit.setId(2);
 kit.setName("glass");
 kit.setLocation("mysuru");
return kit;
}

@Bean(name="kitchen2")
public Kitchen getKitchen2()
{
Kitchen kit =new Kitchen();
 kit.setId(3);
 kit.setName("glass");
 kit.setLocation("mysuru");
return kit;

}
@Bean(name="kitchen3")
public Kitchen getkitchen3()
{
Kitchen kit =new Kitchen();
 kit.setId(4);
 kit.setName("glass");
 kit.setLocation("mysuru");
return kit;

}
@Bean(name="kitchen4")
public Kitchen getKitchen4()
{
Kitchen kit =new Kitchen();
 kit.setId(5);
 kit.setName("glass");
 kit.setLocation("mysuru");
return kit;

}


}
