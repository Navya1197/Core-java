package com.xworkz.boot4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Runner1 {

public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded successfully");
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/theatre","root", "Xworkzodc@123");
		String query ="insert into screen values(1,'projection screen','banglore')";
		//String query1 ="insert into patient values(2,'guru','baglore',3654647)";*/
				
		Statement statement =con.createStatement();
		int i =statement.executeUpdate(query);
		System.out.println(i);
		if(i!=0)
		{
			System.out.println("insertion done");
		}else
		{
			System.out.println("insertion is not done");
		}
		
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}


	
	
}




