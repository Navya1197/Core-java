package com.xworkz.juice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.xworkz.fruit.Fruit;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component



public class Juice {

@Value("1")
private int id;
@Value("maaza")
private String name;
@Autowired
private Fruit fruit;


}
