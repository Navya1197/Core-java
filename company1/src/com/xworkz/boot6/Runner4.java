package com.xworkz.boot6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.company1.companyDTO.CompanyDTO;

public class Runner4 {

public static void main(String[] args) {
	

CompanyDTO dto= new CompanyDTO(1,"Msc","hassan");	
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
			
		System.out.println("driver is loaded");
		
		
		Connection con=	  DriverManager.getConnection("jdbc:mysql://localhost:3306/october20","root", "Xworkzodc@123");
		String query ="delete  from prashanth where location='banglore'";
		   PreparedStatement statement =con.prepareStatement(query);
		   /*statement.setInt(1, dto.getId());
		   statement.setString(2, dto.getQualification());
		   statement.setString(3, dto.getLocation());*/
		   int i  =  statement.executeUpdate(query);
		  
		   if(i!=0)
		   {
			   System.out.println("delete is done");
		   }
		   else
		   {
			   System.out.println("delete is not done");
		   
		   }	
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}








}









}
