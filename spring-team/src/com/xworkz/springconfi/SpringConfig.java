package com.xworkz.springconfi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.xworkz.team.Team;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Configuration
@ComponentScan(basePackages = "com.xworkz.players")
public class SpringConfig {
@Bean
public Team getTeam()
{
	Team team =new Team();
	return team;
	
}
@Configuration
@ComponentScan(basePackages = "com.xworkz.viewers")
public class ChannelConfig {
@Bean
public Team getTeam()
{
	Team team =new Team();
	return team;
	
}
}
}





