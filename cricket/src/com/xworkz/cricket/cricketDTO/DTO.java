package com.xworkz.cricket.cricketDTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class DTO {

	private int id ;
	@NotBlank
	@NotEmpty
	@NotNull
	@Size(min=2,max=16) 
	private String crick_name;
	private int no_of_teams;
	/*private int no_of_players;
	private String fav_team;
	private String fav_team_captain;
	private String fav_player;
	private String start_mnth;
	private String end_mnth;
	private String ipl_wnr;*/

	}












