package com.xworkz.festival.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



import com.xworkz.festival.festDTO.FestivalDTO;

public class FestRepoImpl implements FestRepo {

	String query;	

	public 	FestRepoImpl()
	{
		System.out.println("festival implementation");
	}
	public FestRepoImpl(String query)
	{
		this.query=query;
	}
	@Override
	
		public boolean onSave(FestivalDTO dt) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/birthday","root", "Xworkzodc@123");

				PreparedStatement stmt=con.prepareStatement(query);
				stmt.setInt(1, dt.getId());
				stmt.setString(2,dt.getName());
				stmt.setString(3, dt.getMonth());
				stmt.setInt(4, dt.getYear());
				stmt.setString(5, dt.getDay());
				
				int i=stmt.executeUpdate();
				if(i!=0) {
					System.out.println("data saved Successfully");
				}else {
					System.out.println("data not saved");
				}
			}catch(Exception e) {
				//System.out.println("classNotFoundException");
			}
			return true;
	}
}
		

	
	/*@Override
	public boolean onUpdate(int id) {
		
	System.out.println("inside update method");
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
    	   System.out.println("driver is loaded");
    	   
 Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/birthday","root", "Xworkzodc@123");
   String query ="update festi set name='sheelu' where id=1";
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





		
	


