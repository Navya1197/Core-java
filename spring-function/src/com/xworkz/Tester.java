package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.xworkz.address.Address;
import com.xworkz.address.Area;
import com.xworkz.address.City;
import com.xworkz.address.State;
import com.xworkz.person.Person;
import com.xworkz.springconfig.SpringConfig;


public class Tester {

public static void main(String[] args) {
	
/*Person person=new Person();
Address adr = new Address();
Area area =new Area();
City city =new City();
Country country =new Country();
State state =new State();
Street street= new Street();
person.setAddress(adr);
person.setId(1);
person.setName("vijay nagar");
adr.setCountry(country);
area.setStreet(street);
city.setArea(area);
country.setState(state);
state.setCity(city);
street.setName("rajajinager");
street.setStreetNumber(1);
System.out.println(person);*/

ApplicationContext application = new AnnotationConfigApplicationContext(SpringConfig.class);
 Person person= application.getBean(Person.class);
 System.out.println(person);
}
}















