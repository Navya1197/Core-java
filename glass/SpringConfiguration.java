package com.xworkz.glass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
@Bean(name="glass")
public Glass getGlass()
{
	Glass gls =new Glass();
	gls.setId(1);
	gls.setName("glass");
	gls.setPlace("manglore");
	return gls;
}
@Bean(name="glass1")
public Glass getGlass1()
{
	Glass gls =new Glass();
	gls.setId(2);
	gls.setName("glass");
	gls.setPlace("mandya");
	return gls;
}
@Bean(name="glass2")
public Glass getGlass2()
{
	Glass gls =new Glass();
	gls.setId(3);
	gls.setName("glass");
	gls.setPlace("manglore");
	return gls;
}

@Bean(name="glass3")
public Glass getGlass3()
{
	Glass gls =new Glass();
	gls.setId(4);
	gls.setName("glass");
	gls.setPlace("banglore");
	return gls;
}
@Bean(name="glass4")
public Glass getGlass4()
{
	Glass gls =new Glass();
	gls.setId(5);
	gls.setName("glass");
	gls.setPlace("mysuru");
	return gls;
}





}
