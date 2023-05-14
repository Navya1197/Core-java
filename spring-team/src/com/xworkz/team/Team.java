package com.xworkz.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.xworkz.players.Players;

import lombok.Getter;

import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Component
public class Team {

@Value("1")
private int id;
@Value("navya")
private String name;
@Autowired
private Players player;

public Team()
{
System.out.println("team players");
}
}
