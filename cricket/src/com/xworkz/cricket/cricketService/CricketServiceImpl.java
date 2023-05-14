package com.xworkz.cricket.cricketService;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.cricket.cricketDTO.DTO;
import com.xworkz.cricket.cricketrepository.CricketRepository;

public class CricketServiceImpl implements CricketService {

	CricketRepository cric;

	public CricketServiceImpl() {
		System.out.println("cricket Implementation");
	}

	public CricketServiceImpl(CricketRepository crick) {
		this.cric = crick;
	}

	@Override
	public boolean validateAndSave(DTO dt) {
		System.out.println("this is validate and save");
		if (dt != null) {
			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator valid = factory.getValidator();
			Set<ConstraintViolation<DTO>> violationMessages = valid.validate(dt);
			if (violationMessages.isEmpty()) {
				boolean save = this.cric.onSave(dt);
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
