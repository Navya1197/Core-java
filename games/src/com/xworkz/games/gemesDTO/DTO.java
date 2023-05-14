package com.xworkz.games.gemesDTO;



import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DTO {
private int id;

@NotBlank
@NotNull
@NotEmpty

private String gameName;
private int no_of_players;
private int no_of_teams;
private String place;
private String game_start;
private String game_end;
private int no_games;

}






