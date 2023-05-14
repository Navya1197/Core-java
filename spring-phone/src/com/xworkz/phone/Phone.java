package com.xworkz.phone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.xworkz.application.Application;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Component

public class Phone {

@Value("1")	
private int id;
@Value("oppo")
private String name;
@Autowired
private Application application;
}
