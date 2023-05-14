package com.xworkz.cricket.cricketrepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.cricket.cricketDTO.DTO;

public class RepositoryImpl implements CricketRepository {
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
			stmt.setString(2, dt.getCrick_name());
			stmt.setInt(3, dt.getNo_of_teams());
			/*stmt.setInt(4, dt.getNo_of_players());
			stmt.setString(5, dt.getEnd_mnth());
			stmt.setString(6, dt.getFav_player());
			stmt.setString(7,dt.getFav_team());
			stmt.setString(8, dt.getFav_team_captain());
			stmt.setString(9, dt.getIpl_wnr());
			stmt.setString(10, dt.getStart_mnth());*/
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
