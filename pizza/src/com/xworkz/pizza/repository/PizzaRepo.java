package com.xworkz.pizza.repository;

import com.xworkz.pizza.pizzaDTO.DTO;

public interface PizzaRepo {

abstract boolean onSave(DTO dt);
//abstract boolean onUpdate(int id);


}
