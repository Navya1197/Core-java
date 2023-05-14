package com.xworkz.springapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.springapp.dto.AmunsementParkDTO;
import com.xworkz.springapp.exception.AmunsementParkException;
import com.xworkz.springapp.repository.AmunsementParkRepository;
import com.xworkz.springapp.service.AmunsementParkService;

@Component
public class AmunsementParkServiceImpl implements AmunsementParkService {
     @Autowired 
	private AmunsementParkRepository repo;
	
	@Override
	public AmunsementParkDTO validateAndSave(AmunsementParkDTO dto) throws AmunsementParkException {
		AmunsementParkDTO amunsementParkDTO =new AmunsementParkDTO();
		 
		boolean isparkId=false;
		boolean isparkName=false;
		boolean isAddress=false;
		boolean iscityname=false;
		boolean isEntryFee=false;
		boolean isArea=false;
		if(dto.getParkId()>0)
			isparkId =true;
		if(dto.getParkName()!=null && !dto.getParkName().isEmpty())
			isparkName=true;
		if(dto.getAddress()!=null && !dto.getAddress().isEmpty())
			isAddress=true;
		if(dto.getCityName()!=null && !dto.getCityName().isEmpty())
			iscityname=true;
		if(dto.getEntryFee()>0)
			isEntryFee=true;
		if(dto.getArea()!=null && !dto.getArea().isEmpty())
			isArea=true;
		
		if(isparkId==true && isparkName==true && isAddress==true && iscityname==true && isEntryFee==true && isArea==true)
		{
         amunsementParkDTO	=repo.save(amunsementParkDTO);
	
	}
		

		return amunsementParkDTO;

	}
}


		   
		
	
		
	
	
	
	
	
	
	


