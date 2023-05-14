package com.xworkz.shopping.Boot;

import com.xworkz.shopping.repository.Repo;
import com.xworkz.shopping.repository.RepoImpl;
import com.xworkz.shopping.shoppingDTO.DTO;
import com.xworkz.shopping.shoppingService.Service;
import com.xworkz.shopping.shoppingService.ServiceImpl;

public class Runner {

public static void main(String[] args) {
	
	System.out.println("this is mvc project");
	DTO dt =new DTO(1, "navya", "may", "friday");

	String query ="insert into shopping values(?,?,?,?)";
	Repo repo =new RepoImpl(query);

	Service serve =new ServiceImpl(repo);
	serve.validateAndSave(dt);

	serve.onUpdate(1);



}


}
