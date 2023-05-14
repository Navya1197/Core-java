package com.xworkz.festival.boot;

import com.xworkz.festival.festDTO.FestivalDTO;
import com.xworkz.festival.repository.FestRepo;
import com.xworkz.festival.repository.FestRepoImpl;
import com.xworkz.festival.service.FestService;
import com.xworkz.festival.service.ServiceImpl;

public class Runner {

public static void main(String[] args) {
	System.out.println("this is mvc project");
FestivalDTO dt =new FestivalDTO(1, "goodfriday", "dec", 2023, "friday");

	String query="insert into festi values(?,?,?,?,?)";
	FestRepo repo =new FestRepoImpl(query);

	FestService serve =new ServiceImpl(repo);
	serve.validateAndSave(dt);

	serve.updateDTO(1);	





}




}
