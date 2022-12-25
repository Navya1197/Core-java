class DominoTester
{
public static void main(String args[])
{
double priceOfItem = Domino.findItem("chicken biriyaani",3);
double costOfItem = Domino.findItem("bread",4);
double amountOfItem = Domino.findItem("burger",2);

System.out.println("The item price is: "+ priceOfItem);
System.out.println("The item price is: "+ costOfItem);
System.out.println("The item price is: "+ amountOfItem);
System.out.println("findItem main method is ended");

}
}

