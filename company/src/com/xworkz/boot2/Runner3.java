package com.xworkz.boot2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Runner3 {


public static void main(String[] args) {
	
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver load succesfully");
	    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/airport","root", "Xworkzodc@123");
	     String query ="DELETE from terminal where location='banglore'";
	    Statement statement= con.createStatement();
	    int i =statement.executeUpdate(query);
	     System.out.println(i);
		if(i!=0)
		{
			System.out.println("delete is done");
		}else
		{
			System.out.println("delete is not done");
		}
		
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    
	}
	
}





	
	




}






