package com.xworkz.birthday.repository;

import com.xworkz.birthday.birthdayDTO.DTO;

public interface BirthdayRepo {

abstract boolean onSave(DTO dt);
abstract boolean onUpdate(int id);
abstract boolean readById(int id);
abstract boolean onDelete(String place);








}
