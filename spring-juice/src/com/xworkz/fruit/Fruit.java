package com.xworkz.fruit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

@ToString
@Component

public class Fruit {
@Value("1")
private int id;
@Value("lemon")
private String name;



}
