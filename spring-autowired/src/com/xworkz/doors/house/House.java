package com.xworkz.doors.house;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.xworkz.doors.Doors;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor

public class House {

     @Value("1")
	private int id;
     @Value("kamadhenu")
	private String name;
     @Autowired
	private Doors doors;




}
