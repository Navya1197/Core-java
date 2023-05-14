package com.xworkz.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.springapp.dto.AmunsementParkDTO;
import com.xworkz.springapp.exception.AmunsementParkException;
import com.xworkz.springapp.service.AmunsementParkService;

@Component
public class AmunsementParkController {

@Autowired
private AmunsementParkService amunsementParkService;

//processing of dto and return the same


public AmunsementParkDTO process(AmunsementParkDTO dto) throws AmunsementParkException
{
try
{
if(dto!=null)
{
    AmunsementParkDTO proccessedDTO= amunsementParkService.validateAndSave(dto);
	return proccessedDTO;
}
else
{
}
}catch(AmunsementParkException e) {
e.printStackTrace();
throw new AmunsementParkException();
}
return dto;
}
}





