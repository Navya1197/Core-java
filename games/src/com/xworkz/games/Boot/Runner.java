package com.xworkz.games.Boot;


import com.xworkz.games.GamesRepository.Repository;
import com.xworkz.games.GamesRepository.RepositoryImpl;
import com.xworkz.games.Gamesservice.Service;
import com.xworkz.games.Gamesservice.ServiceImpl;
import com.xworkz.games.gemesDTO.DTO;

public class Runner {
	public static void main(String[] args) {
		
		System.out.println("this is mvc project");
		DTO dt = new DTO(1,"cricket", 11, 10 ,"banglore","march","may", 12);

		String query="insert into coko2 values(?,?,?,?,?,?,?,?)";   //(,?,?,?,?,?,?,?)";
		Repository repo =new RepositoryImpl(query);
		Service crick =new ServiceImpl(repo);
		//crick.validateAndSave(dt);
		//repo.onSave(dt);
		crick.validateAndSave(dt);






}
}
//DTO dt = new DTO(1,"cricket", 11,10 ,"banglore","march","may", 12);






