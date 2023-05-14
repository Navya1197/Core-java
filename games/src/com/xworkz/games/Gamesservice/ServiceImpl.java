package com.xworkz.games.Gamesservice;



import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.games.GamesRepository.Repository;
import com.xworkz.games.gemesDTO.DTO;

public class ServiceImpl implements Service {

	Repository repos;

public ServiceImpl() {
	
	System.out.println("coko Implementation");
	}

public ServiceImpl(Repository repos){
		this.repos= repos;
	}

	@Override
	public boolean validateAndSave(DTO dt) {
		System.out.println("this is validate and save");
		if (dt != null) {
			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator valid = factory.getValidator();
			Set<ConstraintViolation<DTO>> violationMessages = valid.validate(dt);
			if (violationMessages.isEmpty()) {
				boolean save = this.repos.onSave(dt);
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

	
	
	





