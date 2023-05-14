package com.xworkz.sweetsapp.confi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.sweetsapp.category.Category;
import com.xworkz.sweetsapp.food.Food;
import com.xworkz.sweetsapp.spareparts.SpareParts;
import com.xworkz.sweetsapp.sweets.Sweets;

@Configuration
@ComponentScan(basePackages = "com.xworkz.sweetsapp")

public class Confi {
	


@Bean
public List<Sweets> getSweets()
{
List<Sweets> list=new ArrayList<Sweets>();
list.add(new Sweets(1,"badusha"));
list.add(new Sweets(2,"peda"));
list.add(new Sweets(3,"mysurupaku"));
list.add(new Sweets(4,"laddu"));
list.add(new Sweets(5,"barfi"));
list.add(new Sweets(6,"bread"));
list.add(new Sweets(7,"Butermilk"));
list.add(new Sweets(8,"Biscuit"));
list.add(new Sweets(9,"Boost"));
list.add(new Sweets(10,"jilabi"));
list.add(new Sweets(11,"IceCReam"));
list.add(new Sweets(12,"rasgulla"));
list.add(new Sweets(13,"Chocolates"));
list.add(new Sweets(14,"rasmalai"));
list.add(new Sweets(15,"kheer"));
return list;
}
@Bean
public List<Food> getFood()
{
List<Food> food =new ArrayList<Food>();
food.add(new Food(1,"Puliogere"));
food.add(new Food(2,"Bisibele bath"));
food.add(new Food(3,"Palav"));
food.add(new Food(4,"Noddles"));
food.add(new Food(5,"Ramen"));
food.add(new Food(6,"Fish"));
food.add(new Food(7,"Biryani"));
food.add(new Food(8,"pizza"));
food.add(new Food(9,"momos"));
food.add(new Food(10,"Aloo parota"));
food.add(new Food(11,"Idli"));
food.add(new Food(12,"poori"));
food.add(new Food(13,"masala dosa"));
food.add(new Food(14,"pongal"));
food.add(new Food(15,"suji"));
return food;
}
@Bean
public List<SpareParts> getSpareParts()
{
List<SpareParts> list =new ArrayList<SpareParts>();
	
list.add(new SpareParts(1,"Battery"));
list.add(new SpareParts(2,"Glow plug"));
list.add(new SpareParts(3,"radiator"));
list.add(new SpareParts(4,"Transmission"));
list.add(new SpareParts(5,"Automotive oil"));
list.add(new SpareParts(6,"axle"));
list.add(new SpareParts(7,"Bearing"));
list.add(new SpareParts(8,"clutch"));
list.add(new SpareParts(9,"Enginoil"));
list.add(new SpareParts(10,"Muffler"));
list.add(new SpareParts(11,"jack"));
list.add(new SpareParts(12,"Solenoid"));
list.add(new SpareParts(13,"piston"));
list.add(new SpareParts(14,"Radiator"));
list.add(new SpareParts(15,"Tire"));
return list;
}

@Bean
public List<Category> getCategory()
{
	List<Category> list = new ArrayList<Category>();
	list.add(new Category(1,"tea"));
	list.add(new Category(2,"coffe"));
	list.add(new Category(3,"coldcoffe"));
	list.add(new Category(4,"milkShake"));
	list.add(new Category(5,"green tea"));
	list.add(new Category(6,"mangojuice"));
	list.add(new Category(7,"green juice"));
	list.add(new Category(8,"apple juice"));
	list.add(new Category(9,"horlicks "));
	list.add(new Category(10,"ginger tea"));
	list.add(new Category(11,"boost"));
	list.add(new Category(12,"coldcoffe"));
	list.add(new Category(13,"green tea"));
	list.add(new Category(14,"green tea"));
	list.add(new Category(15,"green tea"));
	
	
	return list;
}





	
}
