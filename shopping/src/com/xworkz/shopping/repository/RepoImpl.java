package com.xworkz.shopping.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.xworkz.shopping.shoppingDTO.DTO;

public class RepoImpl implements Repo {

	String query;
	public 	RepoImpl()
	{
		System.out.println("birthday implementation");
	}
	public RepoImpl(String query)
	{
		this.query=query;
	}

		
	@Override
	public boolean onSave(DTO dt) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/birthday","root", "Xworkzodc@123");
            
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setInt(1, dt.getId());
			stmt.setString(2, dt.getName());
			stmt.setString(3, dt.getCity());
			stmt.setString(4, dt.getArea());
			
			
		    int i=stmt.executeUpdate();
			if(i!=0) {
				System.out.println("data saved Successfully");
			}else {
				System.out.println("data not saved");
			}
		}catch(Exception e) {
			System.out.println("ClassNotFoundException");
		}
		return true;
	}
}











