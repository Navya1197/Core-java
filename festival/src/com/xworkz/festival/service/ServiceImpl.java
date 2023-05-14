package com.xworkz.festival.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


import com.xworkz.festival.festDTO.FestivalDTO;
import com.xworkz.festival.repository.FestRepo;

public class ServiceImpl implements FestService {

FestRepo repo;
	
	public ServiceImpl()
	{
		System.out.println("Service implementation");
	}
	public ServiceImpl(FestRepo repo)

	{
		this.repo=repo;
	}
	
	@Override
	public boolean validateAndSave(FestivalDTO dt) {
		System.out.println("this is validate and save");
		if (dt != null) {
			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator valid = factory.getValidator();
			Set<ConstraintViolation<FestivalDTO>> violationMessages = valid.validate(dt);
			if (violationMessages.isEmpty()) {
				boolean save = this.repo.onSave(dt);
				System.out.println(save);
			}else {
				System.out.println(violationMessages.toString());
			}
		}else {
			System.out.println("DTO is null");
		}
		
		return true;
	}

    @Override
	public boolean updateDTO(int id) {
		try {
	    	   Class.forName("com.mysql.cj.jdbc.Driver");
	    	   System.out.println("driver is loaded");
	    	   
	 Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/birthday","root", "Xworkzodc@123");
	   String query ="update festi set name='ugadi' where id=1";
	   Statement statement=  con.createStatement();
	            /*statement.setInt(1, dto.getId());
	            statement.setString(2, dto.getQualification());
	            statement.setString(3, dto.getLocation());*/
	             int i = statement.executeUpdate(query);
	             if(i!=0)
	             {
	            	 System.out.println("update is done");
	             }
	             else
	            	 
	             {
	            	 System.out.println("update is not done");
	            	 
	            	 
	             }
					
	                 } catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
return false;
}
}
	




