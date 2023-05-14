package com.xworkz.shopping.shoppingService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.shopping.repository.Repo;
import com.xworkz.shopping.shoppingDTO.DTO;

public class ServiceImpl implements Service {
	Repo repo;
	
	public ServiceImpl()
	{
		System.out.println("Service implementation");
	}
	public ServiceImpl(Repo repo)

	{
		this.repo=repo;
	}
	@Override
	public boolean validateAndSave(DTO dt) {
		System.out.println("this is validate and save");
		if (dt != null) {
			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator valid = factory.getValidator();
			Set<ConstraintViolation<DTO>> violationMessages = valid.validate(dt);
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

	
	
	public boolean onUpdate(int id) {
		 {
			 try {
		    	   Class.forName("com.mysql.cj.jdbc.Driver");
		    	   System.out.println("driver is loaded");
		    	   
		 Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/birthday","root", "Xworkzodc@123");
		   String query ="update shopping set name='ugadi' where id=1";
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




		}
		return false;

	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	


