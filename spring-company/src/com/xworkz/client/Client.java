package com.xworkz.client;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Component
@Setter
@Getter




public class Client {


private int id;

private String name;
public Client(int id, String name)
{
	System.out.println(this.getClass().getSimpleName()+" object is created");
}

}
