package com.xworkz.waterfall.waterdto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class DTO {
  
	
	private int id;
	private String name;
	@NotEmpty
	@NotBlank
	@NotNull
	@Size(min=2,max=10)
	private String place;
	private String area;







}
