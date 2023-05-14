package com.xworkz.wedding.Boot;

import com.xworkz.wedding.DTO.DTO;
import com.xworkz.wedding.repository.RepoImpl;
import com.xworkz.wedding.repository.WeddingRepo;
import com.xworkz.wedding.service.ServiceImpl;
import com.xworkz.wedding.service.WeddingService;

public class Runner {

public static void main(String[] args) {
	
	System.out.println("this is wedding  mvc project");
	DTO dt = new  DTO(1, "wedding", 2, "dec", 2023);

	String query="insert into wedding values(?,?,?,?,?)";
	
		WeddingRepo repo =new RepoImpl(query);

		WeddingService serve =new ServiceImpl(repo);
		serve.validateAndSave(dt);
repo.onSave(dt);
repo.onUpdate(1);
repo.onDelete(1);










}
}
