package com.xworkz.pizza.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.xworkz.pizza.pizzaDTO.DTO;

public class RepoImpl  implements PizzaRepo{

	String query;	

	public 	RepoImpl()
	{
		System.out.println("pizza implementation");
	}
	public RepoImpl(String query)
	{
		this.query=query;
	}
	@Override
	public boolean onSave(DTO dt) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Birthday","root", "Xworkzodc@123");
            System.out.println("insert method");
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setInt(1, dt.getId());
			stmt.setString(2, dt.getName());
			stmt.setInt(3, dt.getAmount());
			stmt.setString(4, dt.getDeliveryApp());
			
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
	
	
/*@Override
	public boolean onUpdate(int id) {
		
	System.out.println("inside update method");
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
    	   System.out.println("driver is loaded");
    	   
 Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/birthday","root", "Xworkzodc@123");
   String query ="update pizza set name='burger' where id=1";
   Statement st =con.createStatement();
   int i =st.executeUpdate(query);
   if(i!=0)
   {
	   System.out.println("updated");
   }
   else
   {
	   System.out.println("not updated");
   }
	}
	catch(Exception e)
   {
	e.printStackTrace();   
   }
	return false;*/
}






	
	
	
	
	
	
	
	
	
	
	
	
	