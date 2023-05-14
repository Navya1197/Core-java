package com.xworkz.waterfall.waterfallService;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.waterfall.repo.WaterfallRepository;
import com.xworkz.waterfall.waterdto.DTO;

public class ServiceImpl implements Service {

WaterfallRepository water;
	
	
	public ServiceImpl()
	{
		System.out.println("water implementation");
	}
	public ServiceImpl(WaterfallRepository  water)
	{
		this.water=water;
	}
	@Override
	public boolean validateAndSave(DTO dt) {
		System.out.println("this is validate and save");
		if (dt != null) {
			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator valid = factory.getValidator();
			Set<ConstraintViolation<DTO>> violationMessages = valid.validate(dt);
			if (violationMessages.isEmpty()) {
				boolean save = this.water.onSave(dt);
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
	
	












