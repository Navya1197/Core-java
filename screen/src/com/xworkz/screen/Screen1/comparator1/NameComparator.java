package com.xworkz.screen.Screen1.comparator1;

import java.util.Comparator;

import com.xworkz.screen.screen.ScreenDTO;

public class NameComparator implements Comparator<ScreenDTO> {

	@Override
	public int compare(ScreenDTO o1, ScreenDTO o2) {
		
		return o1.getScreenName().compareTo(o2.getScreenName());
	}




}
