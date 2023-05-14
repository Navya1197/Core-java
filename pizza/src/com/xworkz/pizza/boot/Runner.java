package com.xworkz.pizza.boot;


import com.xworkz.pizza.pizzaDTO.DTO;
import com.xworkz.pizza.repository.PizzaRepo;
import com.xworkz.pizza.repository.RepoImpl;
import com.xworkz.pizza.service.Service;
import com.xworkz.pizza.service.ServiceImpl;

public class Runner {

public static void main(String[] args) {
	
	System.out.println("this is mvc project");
	DTO dt =new    DTO(1, "pizza", 299, "Zomato");

		String query="insert into pizza values(?,?,?,?)";
		PizzaRepo repo =new RepoImpl(query);

		Service serve =new ServiceImpl(repo);
		serve.validateAndSave(dt);

		serve.updateDTO(1);	






}








}
