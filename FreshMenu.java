class FreshMenu
{
public static double findItems(String items)
{
//System.out.println("invoked findItem");
if(items == "ChickenBiriyaani")
{
System.out.println("the item is available");
return 225.00d;
}
if(items == "salad")
{
System.out.println("the item is available")	;
return 125.00d;
}
if(items == "pizza")
{
System.out.println("the item is available");	
return 230.00d;
}
else
{
System.out.println("Item not available");
return 0.0d;
}
}
}
