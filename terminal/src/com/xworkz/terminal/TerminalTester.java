package com.xworkz.terminal;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.xworkz.terminal.terminal.Comparator1.IdComparator;
import com.xworkz.terminal.terminal.Comparator1.TerminalLocationComparator;
import com.xworkz.terminal.terminal.Comparator1.TerminalNameComparator;
import com.xworkz.terminal.terminal.dto.TerminalDTO;


public class TerminalTester {

public static void main(String args[])
{
	
//List<TerminalDTO> list = new ArrayList<TerminalDTO>();
    

	Scanner sc =new Scanner(System.in);
	List<TerminalDTO> list = new ArrayList<TerminalDTO>();
    
	//TerminalDTO dto = new TerminalDTO();

   list.add(new TerminalDTO("navya",1,"mysuru"));
   list.add(new TerminalDTO("kavya",4,"manglore"));
   list.add(new TerminalDTO("sheelu",5,"banglore"));
   System.out.println("sorted by name");
   Collections.sort(list, new TerminalNameComparator());
  for(TerminalDTO tr :list)
    System.out.println(tr);
  System.out.println("sorted by location");
  Collections.sort(list, new TerminalLocationComparator());
  for(TerminalDTO tr1:list)
  System.out.println(tr1);
  System.out.println("sorted by id");
  Collections.sort(list);
  for(TerminalDTO tr2:list)
	  System.out.println(tr2.getId()+" "+tr2.getName()+" "+tr2.getLocation());
}
}

   
