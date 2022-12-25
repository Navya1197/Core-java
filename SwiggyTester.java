class SwiggyTester
{
public static void main(String args[])
{
double priceOfItem = Swiggy.findItems("chicken biriyaani");
double costOfItem = Swiggy.findItems("chicken kabab");

System.out.println("The item price is :"+ priceOfItem);
System.out.println("the item cost is:"+costOfItem);

System.out.println("findItem main method is ended");


}
}


