package com.xworkz.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.company1.companyDTO.CompanyDTO;


public class Runner1 {
public static void main(String[] args) {
	
	CompanyDTO dto =new CompanyDTO(1,"mtech","mysuru");
	
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("driver is loaded");

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/october20","root", "Xworkzodc@123");
String query ="select *from navya";
PreparedStatement statement =con.prepareStatement(query);

System.out.println(statement.getFetchSize());

      /*statement.setInt(1, dto.getId());
      statement.setString(2, dto.getQualification());
      statement.setString(3, dto.getLocation());
          int i = statement.executeUpdate();
      if(i!=0)
      {
    	System.out.println("read query has done");  
      }
      else
      {
    	  System.out.println("read query has not done");
      }*/
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}



}





}
