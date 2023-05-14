package com.xworkz.building;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.xworkz.room.Room;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

@ToString



public class Building {
	@Value("1")
 private int  id;
	@Value("shrinidhi")
private String name;
	@Autowired
 private Room room;




}
