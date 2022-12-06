class Zomato
{
public static double findItem(String item)
{
//System.out.println("invoked findItem");
if (item == "Biriyaani")
{
System .out.println(" the item is available");
return 225.00;
}
else
{
System.out.println(" Item not available");
}
System.out.println("End of the item");
return 0.0;
}

public static double findItem(String item, int quantity)
{
if (item == "Biriyaani")
{
System .out.println(" the item price is 225");
return 225.00*quantity;
}
else 
{
System.out.println(" Item not available");
}
System.out.println("End of the item");
return 0.0;
}	
}	
