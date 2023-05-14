package com.xworkz.channel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;

import com.xworkz.viewers.Viewers;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor

public class Channel {

@Value("1")
private int id;
@Value("public")
private String name;
@Autowired
private Viewers viewers;





}
