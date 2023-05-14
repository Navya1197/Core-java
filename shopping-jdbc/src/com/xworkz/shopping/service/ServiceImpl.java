package com.xworkz.shopping.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.shopping.DTO.ShoppingDTO;
import com.xworkz.shopping.repository.Repo;



public class ServiceImpl implements Service {

    Repo repo;
	
	public ServiceImpl()
	{
		System.out.println("Service wedding implementation");
	}
	public   ServiceImpl(Repo repo)

	{
		this.repo=repo;
	}	
	
@Override
	public boolean validateAndSave(ShoppingDTO dt) {
		
	 {
			System.out.println("this is validate and save");
			if (dt != null) {
				ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
				Validator valid = factory.getValidator();
				Set<ConstraintViolation<ShoppingDTO>> violationMessages = valid.validate(dt);
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

	@Override
	public boolean updateById(int id) {
		
		if(id!=0)
		{
			System.out.println("update data by id");
			boolean update =this.repo.updateById(id);
			System.out.println(update);
		}
		else
		{
		System.out.println("not updated");	
		}
		
	return true;
	}

	@Override
	public boolean updateByName(String name) {
	
		if(name!=null)
		{
			System.out.println("update data by name");
			boolean update =this.repo.updateByName(name);
			System.out.println(update);
		}
		else
		{
		System.out.println(" name is not updated");	
		}
		
	return true;
	
	}

	@Override
	public boolean updateByEmail(String email) {
		
		if(email!=null)
		{
			System.out.println("update data by email");
			boolean update =this.repo.updateByEmail(email);
			System.out.println(update);
		}
		else
		{
		System.out.println("not updated");	
		}
		
	return true;
	
	}	
	@Override
	public boolean readById(int id) {
		if(id!=0)
		{
			System.out.println("read data by id");
			boolean read =this.repo.readById(id);
			System.out.println(read);
		}
		else
		{
		System.out.println("not  read");	
		}
		
	return true;
	}
		
	

	@Override
	public boolean readByName(String name) {
		if(name!=null)
		{
			System.out.println("read data by name");
			boolean read =this.repo.readByName(name);
			System.out.println(read);
		}
		else
		{
		System.out.println("not read");	
		}
		
	return true;
	}
		
		
		
@Override
	public boolean readByEmail(String email) {
		if(email!=null)
		{
			System.out.println("read data by email");
			boolean read =this.repo.readByEmail(email);
			System.out.println(read);
		}
		else
		{
		System.out.println("not read");	
		}
		
	return true;
	}
			
		
	

	@Override
	public boolean deleteById(int id) {
		if(id!=0)
		{
			System.out.println("delete data by id");
			boolean delete =this.repo.deleteById(id);
			System.out.println(delete);
		}
		else
		{
		System.out.println("not delete");	
		}
		
	return true;
	}

	@Override
	public boolean deleteByEmail(String email) {
		if(email!=null)
		{
			System.out.println("delete data by email");
			boolean delete =this.repo.deleteByEmail(email);
			System.out.println(delete);
		}
		else
		{
		System.out.println("not delete");	
		}
		
	return true;
	}
		
		
	

}
