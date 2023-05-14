package com.xworkz.festival.service;

import com.xworkz.festival.festDTO.FestivalDTO;

public interface FestService {

	
	abstract boolean validateAndSave(FestivalDTO dt);
	abstract boolean updateDTO(int id);





}
