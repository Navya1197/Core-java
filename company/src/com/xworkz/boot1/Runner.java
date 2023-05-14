package com.xworkz.boot1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Runner {

public static void main(String[] args) {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded successfully");
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/shopingmall","root", "Xworkzodc@123");
		String query ="select*from shops";
		Statement statement =con.createStatement();
		ResultSet result =statement.executeQuery(query);
		
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}







}






