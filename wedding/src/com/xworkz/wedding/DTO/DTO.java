package com.xworkz.wedding.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DTO {


private int id;
@NotBlank
@NotNull
@NotEmpty
private String name;
private int date;
private String month;
private int year;

}
