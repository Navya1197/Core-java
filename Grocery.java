class GroceryShop
{
public int id;
public String name;
public String[] location;
public String ownerName;
public String[] items;
public Restuarant(String[] location, String name, int id,String ownerName, String[] items)
{
this.id = id;
this.name = name ;
this.location = location ;
this.ownerName = ownerName;
this.items = items;
}
public void displayDetails()
{
System.out.println("displaying grocery info");
System.out.println("the location of the grocery ");
System.out.println("the name of the grocery is "+this.name);
System.out.println("the  id of the  grocery "+this.id);
System.out.println("the  ownername of the grocery "+this.ownerName);
System.out.println("the items of the grocery");
for (int index =0; index< location.length; index++)
{	
System.out.println(location[index]);
}
for(int index = 0; index<items.length; index++)
{
System.out.println(items[index]);	
}
}
}
