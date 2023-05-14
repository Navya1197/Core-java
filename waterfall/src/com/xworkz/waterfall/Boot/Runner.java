package com.xworkz.waterfall.Boot;

import com.xworkz.waterfall.repo.RepoImpl;
import com.xworkz.waterfall.repo.WaterfallRepository;
import com.xworkz.waterfall.waterdto.DTO;
import com.xworkz.waterfall.waterfallService.Service;
import com.xworkz.waterfall.waterfallService.ServiceImpl;

public class Runner {

public static void main(String[] args) {
	System.out.println("mvc is created");
	DTO dt =new DTO(1,"grs","mysuru","ashokpuram");
	String query="insert into water values(?,?,?,?)"; 

	WaterfallRepository wtr =new RepoImpl(query);

	Service serve =new ServiceImpl(wtr);

	serve.validateAndSave(dt);
	//wtr.onSave(dt);






}



}
