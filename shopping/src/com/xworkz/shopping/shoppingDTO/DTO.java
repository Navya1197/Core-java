package com.xworkz.shopping.shoppingDTO;

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
private  String city;
private String area;








}
