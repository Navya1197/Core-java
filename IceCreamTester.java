class IceCream
{
String name;

public static int amul()
{
System.out.println("cool");
return 50;
}
public static int arun()
{
System.out.println("enjoying");
return 40 ;
}
public static int chocolate()
{
System.out.println("goodfeel");
return 55;
}
}
class Amul extends IceCream
{


}
class IceCreamTester
{
public static void main( String args[])
{
IceCream i =new IceCream();
int priceOfIceCream = i.amul();
System.out.println(" the price of icecream is:"+priceOfIceCream);
IceCream ii =new IceCream();
int priceOfIceCream2 = ii.arun();
System.out.println(" the price of icecream is:"+priceOfIceCream2);
IceCream iii =new IceCream();
int priceOfIceCream3 = iii.chocolate();
System.out.println(" the price of icecream is:"+priceOfIceCream3);
}
} 