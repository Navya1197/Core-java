package com.xworkz.laptop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

@Bean(name="laptop")
public Laptop getLaptop()
{
Laptop lap =new Laptop();
lap.setId(1);
lap.setName("dell");
lap.setLocaton("mysuru");
return lap;


}
@Bean(name="laptop1")
public Laptop getLaptop1()
{
Laptop lap =new Laptop();
lap.setId(2);
lap.setName("dell");
lap.setLocaton("mysuru");
return lap;


}
@Bean(name="laptop2")
public Laptop getLaptop2()
{
Laptop lap =new Laptop();
lap.setId(3);
lap.setName("dell");
lap.setLocaton("mysuru");
return lap;


}
@Bean(name="laptop3")
public Laptop getlaptop3()
{
Laptop lap =new Laptop();
lap.setId(4);
lap.setName("dell");
lap.setLocaton("mysuru");
return lap;

}
@Bean(name="laptop4")
public Laptop getLaptop4()
{
Laptop lap =new Laptop();
lap.setId(5);
lap.setName("dell");
lap.setLocaton("mysuru");
return lap;

}

}