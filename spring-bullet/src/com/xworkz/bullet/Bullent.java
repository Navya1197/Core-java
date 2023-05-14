package com.xworkz.bullet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

@ToString
@Component

public class Bullent {
@Value("1")
private int id;
@Value("nav")
private String name;

}
