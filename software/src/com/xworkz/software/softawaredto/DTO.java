package com.xworkz.software.softawaredto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DTO {

@NotBlank
@NotEmpty
@NotNull
@Size(min=2,max=10)
private String sftwre_company ;
private  String sftwre_engineer;
private String sftwre_developer;
private String sftware_name;



}
