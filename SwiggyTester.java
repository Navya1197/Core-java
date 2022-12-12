class SwiggyTester
{
public static void main(String args[])
{
Swiggy.findItem("kabab");
Swiggy.findItem("idli");
int itemWithQuantity = Swiggy.findItem("kabab",3);
int itemWithVolume = Swiggy.findItem("idli",4);
System.out.println("The item price is :"+itemWithQuantity);
System.out.println("The item price is :"+itemWithVolume);
System.out.println("findItem main method is ended");
}

}
