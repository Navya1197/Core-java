package com.xworkz.sweetsapp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.sweetsapp.automobile.Automobile;
import com.xworkz.sweetsapp.category.Category;
import com.xworkz.sweetsapp.confi.Confi;
import com.xworkz.sweetsapp.food.Food;
import com.xworkz.sweetsapp.kanti.Kanti;
import com.xworkz.sweetsapp.restuarant.Restuarant;
import com.xworkz.sweetsapp.spareparts.SpareParts;
import com.xworkz.sweetsapp.sweets.Sweets;
import com.xworkz.sweetsapp.teashop.TeaShop;


public class Tester {

public static void main(String[] args) {
	
	 ApplicationContext application = new AnnotationConfigApplicationContext(Confi.class);
	 
	 Kanti kan=application.getBean(Kanti.class);
	 List<Sweets> list2= new Confi().getSweets();
	 kan.setSweets(list2);
	 System.out.println(kan);
	
	 Restuarant ret= application.getBean(Restuarant.class);
	 List<Food> list3=new Confi().getFood();
	 ret.setFood(list3);
	 System.out.println(ret);

	 

	 TeaShop tea= application.getBean(TeaShop.class);
	 List<Category> list=new Confi().getCategory();
	 tea.setCategory(list);
	 System.out.println(tea);
	 
	 Automobile auto= application.getBean(Automobile.class);
	 List<SpareParts> list1=new Confi().getSpareParts();
	 auto.setSpareParts(list1);
	 System.out.println(auto);
	 
	 


}


}
