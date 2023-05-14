package com.xworkz.wedding.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.wedding.DTO.DTO;


		

public class RepoImpl implements WeddingRepo{

String query;	

	public 	RepoImpl()
	{
		System.out.println("wedding implementation");
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
            //String query ="insert into wedding values(?,?,?,?,?,?)";
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setInt(1, dt.getId());
			stmt.setString(2, dt.getName());
			stmt.setInt(3, dt.getDate());
			stmt.setString(4, dt.getMonth());
			stmt.setInt(5, dt.getYear());
			
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

    @Override
	public boolean onUpdate(int id) {
		
	System.out.println("inside update method");
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
    	   System.out.println("driver is loaded");
    	   
 Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/birthday","root", "Xworkzodc@123");
   String query ="update wedding set name=? where id=?";
      PreparedStatement stmt  = con.prepareStatement(query);
      stmt.setString(1, "akshi");
      stmt.setInt(2, id);
      int i =stmt.executeUpdate();
     
   if(i!=0)
   {
	   System.out.println("update");
   }
   else
   {
	   System.out.println("not update");
   }
	}
	catch(Exception e)
   {
	e.printStackTrace();   
   }
	return true;
	
}
    @Override
	public boolean onDelete(int id) {
		
	System.out.println("inside delet method");
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
    	   System.out.println("driver is loaded");
    	   
 Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/birthday","root", "Xworkzodc@123");
   String query ="delete from wedding where month=?";
      PreparedStatement stmt  = con.prepareStatement(query);
      stmt.setString(1, "dec");
      //stmt.setInt(2, id);
      int i =stmt.executeUpdate();
     
   if(i!=0)
   {
	   System.out.println("delete");
   }
   else
   {
	   System.out.println("not deleted");
   }
	}
	catch(Exception e)
   {
	e.printStackTrace();   
   }
	return true;
	
}
}





























