class Domino
{
public static double findItem(String item)
{
//System.out.println("invoked findItem");
if(item == "chicken biriyaani")
{
System .out.println(" the item is available");
return 225.00;
}
if(item=="bread")
{
System.out.println("the item is available");
return 25.0;
}
if(item=="burger")
{
System.out.println(" the item is available");
return 200.00;
}
else
{
System.out.println(" Item is not available");
return 0.0;
}
}
public static double findItem(String item, int quantity)
{
if(item == "chicken biriyaani")
{
System.out.println(" the price of item is 225");
return 225.00*quantity;	
}	
if(item=="bread")
{
System.out.println("the price of item is 25");
return 25.0*quantity;
}
if(item=="burger")
{
System.out.println(" the price of item is 2000");
return 200.00*quantity;
}
else
{
System.out.println(" Item is not available");
return 0.0;
}
}
}
