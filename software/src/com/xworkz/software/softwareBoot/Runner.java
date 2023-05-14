package com.xworkz.software.softwareBoot;


import com.xworkz.software.repository.SoftwareRepoImpl;
import com.xworkz.software.repository.SoftwareRepository;
import com.xworkz.software.softawaredto.DTO;
import com.xworkz.software.softwareService.Service;
import com.xworkz.software.softwareService.SoftwareServiceImpl;

public class Runner {

public static void main(String[] args) {
	System.out.println(" mvc project");
	DTO dt =new DTO("Infosys", "akshi", "ranju","java");
	String query="insert into software values(?,?,?,?)"; 

	SoftwareRepository repo =new SoftwareRepoImpl();

	Service crick =new SoftwareServiceImpl(repo);

	crick.validateAndSave(dt);





}


}
