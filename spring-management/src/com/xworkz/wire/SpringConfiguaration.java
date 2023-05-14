package com.xworkz.wire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguaration {

@Bean(name="man")
public  Man getMan()
{
Man m=new Man();
m.setId(1);
m.setName("harsh");
m.setLocation("mysuru");
return m;

}
@Bean(name="man1")
public  Man getMan1()
{
Man m=new Man();
m.setId(2);
m.setName("harsh");
m.setLocation("mysuru");
return m;
}

@Bean(name="man2")
public  Man getMan2()
{
Man m=new Man();
m.setId(3);
m.setName("harsh");
m.setLocation("mysuru");
return m;
}
@Bean(name="man3")
public  Man getMan3()
{
Man m=new Man();
m.setId(4);
m.setName("harsh");
m.setLocation("mysuru");
return m;
}
@Bean(name="man4")
public  Man getMan4()
{
Man m=new Man();
m.setId(5);
m.setName("harsh");
m.setLocation("banglore");
return m;
}
}


