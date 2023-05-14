package com.xworkz.software.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.software.softawaredto.DTO;

public class SoftwareRepoImpl implements SoftwareRepository {

	
	String query;
	public 	SoftwareRepoImpl()
	{
		System.out.println(" software repository implementation");
	}
		
		
		
		@Override
		public boolean onSave(DTO dt) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Cricket1","root", "Xworkzodc@123");

				PreparedStatement stmt=con.prepareStatement(query);
				stmt.setString(1, dt.getSftwre_company());
				stmt.setString(2, dt.getSftwre_engineer());
				stmt.setString(3, dt.getSftwre_developer());
				stmt.setString(4, dt.getSftware_name());
				
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

	}
