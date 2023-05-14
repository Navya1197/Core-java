package com.xworkz.springapp.service;

import com.xworkz.springapp.dto.AmunsementParkDTO;
import com.xworkz.springapp.exception.AmunsementParkException;

public interface AmunsementParkService {

 AmunsementParkDTO validateAndSave(AmunsementParkDTO dto) throws AmunsementParkException;



}
