package com.xworkz.cricket.cricketrepository;

import com.xworkz.cricket.cricketDTO.DTO;

public interface CricketRepository {

	abstract boolean onSave(DTO dt);

}
