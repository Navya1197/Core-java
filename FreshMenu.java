class FreshMenu
{
public static double findItems(String items)
{
//System.out.println("invoked findItem");
if (items == " Chicken Biriyaani")
{
System .out.println(" the item is available");
return 225.00;
}
if(items == "salad")
{
System.out.println("the item is available")	;
return 125.00;
}
if(items == "pizza")
{
System.out.println(" the item is available");	
return 230.00;
}
else
{
System.out.println(" Item not available");
}
System.out.println("End of the item");
return 0.0;
}
}
