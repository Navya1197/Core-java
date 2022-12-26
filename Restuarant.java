class Restuarant
{
public int id;
public String location;
public String name;
public String[] workers;
public String[] menu;
public Restuarant(String location, String name, int id,String[] workers, String[] menu)
{
this.id = id;
this.location = location ;
this.workers = workers ;
this.name = name;
this.workers = workers;
this.menu =menu;
}
public void displayDetails()
{
System.out.println("displaying restuarant info");
System.out.println("the name of the restuarant is "+this.name);
System.out.println("the  restuarant location is "+this.location);
System.out.println("the  restuarant workers are");
System.out.println("the  restuarant menu are");
for (int index =0; index< menu.length; index++)
{	
System.out.println(workers[index]);
}
for(int index = 0; index<workers.length; index++)
{
System.out.println(menu[index]);	
}
}
}
