package com.xworkz.springapp.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.springapp.dto.AmunsementParkDTO;
import com.xworkz.springapp.exception.AmunsementParkException;
import com.xworkz.springapp.repository.AmunsementParkRepository;

@Component
public class AmunsementParkRepositoryImpl implements AmunsementParkRepository {

	@Autowired
	List<AmunsementParkDTO> dtos ;
	
	
	
	@Override
	public AmunsementParkDTO save(AmunsementParkDTO dto)  throws AmunsementParkException{
		
		AmunsementParkDTO amunsementdto =new AmunsementParkDTO();
		boolean isAdded=false;
		if(dto!=null)
		{
			isAdded=dtos.add(amunsementdto);
		}
		if(isAdded)
		{
			amunsementdto =dto;
		}
		
		
		return amunsementdto;
	}






}
