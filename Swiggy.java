class Swiggy
{
public static double findItems(String items)
{

//System.out.println("invoked findItem");
if (items == "Chicken Biriyaani")
{
System .out.println(" the item  is available");
return 225.00;
}
if (items == "chicken kabab ")
{
System .out.println(" the items  is available");
return 125.00;
}
else
{
System.out.println(" Items  not available");
return 0.0;
}
}
}



