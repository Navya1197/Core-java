package com.xworkz.theatre.Comparator1;



import java.util.Comparator;

import com.xworkz.theatre.screen.Screen;

public class CityComparator implements Comparator<Screen>{



@Override
public int compare(Screen o1, Screen o2) {
	
	
	 return o1.city.compareTo(o2.city);
}
}
