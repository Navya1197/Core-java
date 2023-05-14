package com.xworkz.shopping.shoppingService;

import com.xworkz.shopping.shoppingDTO.DTO;

public interface Service {


	abstract boolean validateAndSave(DTO dt);
	abstract boolean onUpdate(int id);


}
