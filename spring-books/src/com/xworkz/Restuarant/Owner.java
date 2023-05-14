package com.xworkz.Restuarant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Component
@ToString


public class Owner {


@Autowired
@Qualifier("Indraprasad")
 Restuarant resturant;

}
