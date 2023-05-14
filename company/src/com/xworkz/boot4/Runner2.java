package com.xworkz.boot4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Runner2 {

public static void main(String[] args) {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver load succesfully");
	    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/theatre","root", "Xworkzodc@123");
	     String query ="UPDATE screen  SET location='manglore' where id=1";
	    Statement statement= con.createStatement();
	    int i =statement.executeUpdate(query);
	     System.out.println(i);
		if(i!=0)
		{
			System.out.println("update is done");
		}else
		{
			System.out.println("update is not done");
		}
		
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    
	}


	
	
	
	
}


}
