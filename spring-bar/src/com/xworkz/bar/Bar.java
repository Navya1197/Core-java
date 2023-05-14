package com.xworkz.bar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.xworkz.waiters.Waiters;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

@ToString


public class Bar {
@Value("1")

private int id;
@Value("dhruthi")
private String name;
@Autowired
private Waiters waiters;



}
