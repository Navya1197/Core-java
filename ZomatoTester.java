class ZomatoTester
{
public static void main(String args[])
{
Zomato.findItem("Biriyaani");
double itemWithQuantity = Zomato.findItem("Biriyaani",3);
System.out.println("The item price is :"+itemWithQuantity);

System.out.println("findItem main method is ended");
}

}




