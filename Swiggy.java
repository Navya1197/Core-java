class Swiggy
{
public static int findItem(String item)
{
//System.out.println("invoked findItem");
if(item == "kabab")
{
System.out.println(" the item is available");
return 65;
}
if(item == "idli")
{
System.out.println(" the item is available");
return 30;
}
else
{
System.out.println(" Item not available");
}
System.out.println("End of the item");
return 0;
}

public static int findItem(String item, int quantity)
{
if(item == "kabab")
{
System.out.println(" the item price is 65");
return 65*quantity;
}
if(item == "idli")
{
System.out.println(" the item price is 30");
return 30*quantity;
}
else 
{
System.out.println(" Item not available");
}
System.out.println("End of the item");
return 0;
}	
}	
