package com.xworkz.shopping.service;

import com.xworkz.shopping.DTO.ShoppingDTO;

public interface Service {


	abstract boolean validateAndSave(ShoppingDTO dt) ;
	abstract boolean updateById(int id) ;
	abstract boolean updateByName(String name);
	abstract boolean updateByEmail(String email);
	abstract boolean readById(int id);
	abstract boolean readByName(String name);
	abstract boolean readByEmail(String email) ;
	abstract boolean deleteById(int id);
	abstract boolean deleteByEmail(String email);
		




}
