package com.xworkz.boot2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.company1.companyDTO.CompanyDTO;

public class Runner2 {

	public static void main(String[] args) {
		
	
		CompanyDTO dto = new CompanyDTO(1,"BE","thumkur");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver is loaded");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/october20","root", "Xworkzodc@123");
			String query ="select *from bhavana";
			PreparedStatement statement =con.prepareStatement(query);
		   
	} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}




}
