package com.xworkz.birthday.service;

import com.xworkz.birthday.birthdayDTO.DTO;

public interface BirthDayService {

abstract boolean validateAndSave(DTO dt);
abstract boolean updateDTO(int id);
abstract boolean readById(int id);
abstract boolean delete(String place);


}
