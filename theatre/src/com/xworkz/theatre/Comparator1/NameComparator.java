package com.xworkz.theatre.Comparator1;

import java.util.Comparator;

import com.xworkz.theatre.screen.Screen;

public class NameComparator implements Comparator<Screen> {

	@Override
	public int compare(Screen o1, Screen o2) {
		
		 return o1.name.compareTo(o2.name);
	}

}