package com.xworkz.shopping.boot;

import com.xworkz.shopping.DTO.ShoppingDTO;
import com.xworkz.shopping.repository.Repo;
import com.xworkz.shopping.repository.RepoImpl;
import com.xworkz.shopping.service.Service;
import com.xworkz.shopping.service.ServiceImpl;

public class Runner {

public static void main(String[] args) {
	
	System.out.println("this is   mvc project");
	ShoppingDTO dt = new  ShoppingDTO(1, "navya", "nav@123");
	ShoppingDTO dt1= new  ShoppingDTO(2,"sheelu","sheelu@1234");
	ShoppingDTO dt2= new ShoppingDTO(3,"kavya","kavya@456");
	ShoppingDTO dt3 =new ShoppingDTO(4,"ranju","ranju@1234");
	ShoppingDTO dt4=new ShoppingDTO(5,"aksha","aksha@1234");

	String query="insert into shop values(?,?,?)";
	
		Repo repo =new RepoImpl(query);

		Service serve =new ServiceImpl(repo);
		serve.validateAndSave(dt);
		serve.validateAndSave(dt1);
		serve.validateAndSave(dt2);
		serve.validateAndSave(dt3);
		serve.validateAndSave(dt4);
		serve.updateById(1);
		serve.updateByName("akshi");
		serve.updateByEmail("nav@123");
		serve.readById(3);
		serve.readByName("kavya");
		serve.readByEmail("kavya@456");
		serve.deleteById(2);
		serve.deleteByEmail("nav@123");
		
		
           //repo.onSave(dt);
//repo.onUpdate(1);
//repo.onDelete(1);




}



}
