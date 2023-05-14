package com.xworkz.pizza.pizzaDTO;

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
private int amount;
private String deliveryApp; 






}
