package com.xworkz.terminal.terminal.Comparator1;

import java.util.Comparator;

import com.xworkz.terminal.terminal.dto.TerminalDTO;

public class TerminalLocationComparator implements Comparator<TerminalDTO>{

	

	@Override
	public int compare(TerminalDTO o1, TerminalDTO o2) {
		
		return o1.getLocation().compareTo(o2.getLocation());
	}

}
