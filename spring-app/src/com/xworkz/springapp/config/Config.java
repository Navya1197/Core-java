package com.xworkz.springapp.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.xworkz.springapp.dto.AmunsementParkDTO;

@Configuration
@ComponentScan(basePackages = "com.xworkz.springapp")

public class Config {

@Bean
public List<AmunsementParkDTO> getList() {
	return new ArrayList<AmunsementParkDTO>();
}
@Bean
AmunsementParkDTO getAmunsementParkDTO()
{
   AmunsementParkDTO park =new AmunsementParkDTO();
   park.setParkId(1);
   park.setParkName("grs");
   park.setAddress("vijaynagar");
   park.setCityName("mysuru");
   park.setEntryFee(1224.6d);
   park.setArea("2000sqft");
return park;

}

}





