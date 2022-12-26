class Wire
{
String name;

public static int finolex()
{
System.out.println("good");
return 50;
}
public static int finolex1()
{
System.out.println("not bad");
return 40 ;
}
public static int finolex2()
{
System.out.println("verygood");
return 55;
}
}
class Finolex extends Wire
{


}
class WireTester
{
public static void main( String args[])
{
Wire i =new Wire();
int priceOfFinolex = i.finolex();
System.out.println(" the price of Finolex is:"+priceOfFinolex);
Wire ii =new Wire();
int priceOfFinolex1 = ii.finolex1();
System.out.println(" the price of Finolex1 is:"+ priceOfFinolex1);
Wire iii =new Wire();
int priceOfFinolex2 = iii.finolex2();
System.out.println(" the price of Finolex is:"+priceOfFinolex2);
}
} 