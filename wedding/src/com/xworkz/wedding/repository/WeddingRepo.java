package com.xworkz.wedding.repository;

import com.xworkz.wedding.DTO.DTO;

public interface WeddingRepo {

    abstract boolean onSave(DTO dt);
	abstract boolean onUpdate(int id);
	abstract boolean onDelete(int id);


}
