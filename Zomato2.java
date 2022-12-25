class Zomato2
{
public static double findItem(String item)
{
//System.out.println("invoked findItem");
if (item == "Biriyaani")
{
System.out.println(" the item is available");
return 225.00;
}
if (item == "idli")
{
System.out.println(" the item is available");
return 20.00;
}
else
{
System.out.println(" Item not available");
return 0.0;
}
}
//System.out.println("End of the item");
//return 0.0;

public static double findItem(String item, int quantity)
{
if (item == "Biriyaani")
{
System .out.println("the item price is 225");
return 225.00*quantity;
}
if (item == "idli")
{
System.out.println(" the item price is 20");
return 20.00*quantity;
}
else
{
System.out.println(" Item not available");
return 0.0;
}
//System.out.println("End of the item");
//return 0.0;
}
}






	
	
	