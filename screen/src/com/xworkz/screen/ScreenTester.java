package com.xworkz.screen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.screen.Screen1.comparator1.CityComparator;
import com.xworkz.screen.Screen1.comparator1.NameComparator;
import com.xworkz.screen.screen.ScreenDTO;



public class ScreenTester {

public static void main(String args[])
{
	/*Scanner sc = new Scanner(System.in);
	Screen srn =new Screen("navya","mysuru",644);
	System.out.println("enter the name");
	srn.setScreenName(sc.next());
	System.out.println("enter the city");
	srn.setScreenCity(sc.next());
	System.out.println("enter the number");
	int screenNumber =sc.nextInt();
	srn.setScreenNumber(screenNumber);

sc.close();
System.out.println(srn.toString());
	System.out.println(srn);*/
	
	List<ScreenDTO> list =new ArrayList<ScreenDTO>();
	list.add(new ScreenDTO("nav","ramnagar",534));
	list.add(new ScreenDTO("sheelu","banglore",6887));
	list.add(new ScreenDTO("pooja","manglore",6757));
	System.out.println("aftre name sorting");
	Collections.sort(list, new NameComparator());
	for(ScreenDTO dto :list)
		System.out.println(dto);
	
	System.out.println("aftre city sorting ");
	Collections.sort(list,new CityComparator());
	for(ScreenDTO dto1:list)
		System.out.println(dto1);
	
	
}

} 