package com.xworkz.pizza.service;

import com.xworkz.pizza.pizzaDTO.DTO;

public interface Service {

	abstract boolean validateAndSave(DTO dt);
	abstract boolean updateDTO(int id);

}
