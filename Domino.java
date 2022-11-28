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
}
System.out.println("End of the item");
return 0.0;
}
}
