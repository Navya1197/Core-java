package com.xworkz.doors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Component
public class Glass {

@Value("1")
private int id;
@Value("sheelu")
private String name;


}
