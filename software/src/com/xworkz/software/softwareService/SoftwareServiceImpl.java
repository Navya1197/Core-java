package com.xworkz.software.softwareService;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.software.repository.SoftwareRepository;
import com.xworkz.software.softawaredto.DTO;

public class SoftwareServiceImpl implements Service {

SoftwareRepository soft;
	
	
	public SoftwareServiceImpl()
	{
		System.out.println(" software implementation");
	}
	public SoftwareServiceImpl(SoftwareRepository  soft)
	{
		this.soft=soft;
	}
	
	@Override
	public boolean validateAndSave(DTO dt) {
		System.out.println("this is validate and save");
		if (dt != null) {
			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator valid = factory.getValidator();
			Set<ConstraintViolation<DTO>> violationMessages = valid.validate(dt);
			if (violationMessages.isEmpty()) {
				boolean save = this.soft.onSave(dt);
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

