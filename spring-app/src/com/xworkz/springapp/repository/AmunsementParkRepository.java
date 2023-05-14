package com.xworkz.springapp.repository;

import com.xworkz.springapp.dto.AmunsementParkDTO;
import com.xworkz.springapp.exception.AmunsementParkException;

public interface AmunsementParkRepository {

AmunsementParkDTO save(AmunsementParkDTO dto) throws AmunsementParkException;


}
