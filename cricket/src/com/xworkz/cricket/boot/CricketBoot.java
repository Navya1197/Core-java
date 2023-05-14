package com.xworkz.cricket.boot;

import com.xworkz.cricket.cricketDTO.DTO;
import com.xworkz.cricket.cricketService.CricketService;
import com.xworkz.cricket.cricketService.CricketServiceImpl;
import com.xworkz.cricket.cricketrepository.CricketRepository;
import com.xworkz.cricket.cricketrepository.RepositoryImpl;

public class CricketBoot {

public static void main(String[] args) {
	
System.out.println("this is mvc project");
DTO dt =new DTO(4,"IPL", 10);

String query="insert into crick values(?,?,?)";   //(,?,?,?,?,?,?,?)";
CricketRepository repo =new RepositoryImpl(query);
CricketService crick =new CricketServiceImpl(repo);
//crick.validateAndSave(dt);
//repo.onSave(dt);
crick.validateAndSave(dt);



}

}








