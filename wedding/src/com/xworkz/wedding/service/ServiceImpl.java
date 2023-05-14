package com.xworkz.wedding.service;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.wedding.DTO.DTO;
import com.xworkz.wedding.repository.WeddingRepo;

public class ServiceImpl  implements WeddingService{

WeddingRepo repo;
	
	public ServiceImpl()
	{
		System.out.println("Service wedding implementation");
	}
	public   ServiceImpl(WeddingRepo repo)

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
}



     
	
		
	
	
	
	











