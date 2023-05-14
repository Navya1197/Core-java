package com.xworkz.institute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.xworkz.branch.Branch;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component


public class Institute {

@Value("1")
private int id;
@Value("gecr")
private String name;
@Autowired
private Branch branch;




}
