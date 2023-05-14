package com.xworkz.distributionapp.distributor;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.distributionapp.dto.SalesPersonDTO;

public interface Distributor {

public boolean addSalesPerson(SalesPersonDTO dto) throws Exception;

 public List<SalesPersonDTO> list = new ArrayList<SalesPersonDTO>();
 public List<SalesPersonDTO> getAllSalesPerson();


}
