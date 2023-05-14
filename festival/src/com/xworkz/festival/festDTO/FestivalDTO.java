package com.xworkz.festival.festDTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class FestivalDTO {

private int id;
@NotBlank
@NotEmpty
@NotNull
private String name;
private String month ;
private int year;
private String day;



}
