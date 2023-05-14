package com.xworkz.birthday.birthdayBoot;

import com.xworkz.birthday.birthdayDTO.DTO;
import com.xworkz.birthday.repository.BirthdayRepo;
import com.xworkz.birthday.repository.RepoImpl;
import com.xworkz.birthday.service.BirthDayService;
import com.xworkz.birthday.service.ServiceImpl;

public class Runner {

public static void main(String[] args) {
	
	System.out.println(" mvc project");
	DTO dt =new DTO(1, "navya", "may", 2023, "friday");

	String query="insert into birth values(?,?,?,?,?)";
	BirthdayRepo repo =new RepoImpl(query);

	BirthDayService serve =new ServiceImpl(repo);

	serve.updateDTO(1);
	serve.validateAndSave(dt);
	serve.readById(1);
	serve.delete(query);
	




}






}
