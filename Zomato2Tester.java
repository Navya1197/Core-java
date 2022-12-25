class Zomato2Tester
{
public static void main(String args[])
{
//Zomato1.findItem("Biriyaani");
//Zomato1.findItem("Idli");
System.out.println("findItem main method is started");
double itemWithQuantity = Zomato2.findItem("Biriyaani",3);
double itemWithVolume= Zomato2.findItem("idli",4);
System.out.println("The item price is :"+itemWithQuantity);
System.out.println("The item cost is :"+itemWithVolume);
System.out.println("findItem main method is ended");
}

}

