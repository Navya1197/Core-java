package com.xworkz.games.GamesRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.games.gemesDTO.DTO;

public class RepositoryImpl  implements Repository{

	String query;
	public 	RepositoryImpl()
	{
		System.out.println("repository implementation");
	}
		
	public 	RepositoryImpl(String query){
		this.query=query;
	}
	//{
		//System.out.println("repository implementation");
	//}
		
		@Override
		public boolean onSave(DTO dt) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Cricket1","root", "Xworkzodc@123");
				//String query ="insert into crick values(?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement stmt=con.prepareStatement(query);
				stmt.setInt(1, dt.getId());
				stmt.setString(2, dt.getGameName());
				stmt.setInt(3, dt.getNo_of_players());
				stmt.setInt(4, dt.getNo_of_teams());
				stmt.setString(5, dt.getGame_start());
				stmt.setString(6, dt.getGame_end());
				stmt.setInt(7,dt.getNo_games());
				
				int i=stmt.executeUpdate();
				if(i!=0) {
					System.out.println("data saved Successfully");
				}else {
					System.out.println("data not saved");
				}
			}catch(Exception e) {
				System.out.println("classNotFoundException");
			}
			return true;
		}

	}
