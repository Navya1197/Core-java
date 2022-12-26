class Sim
{
String name;
String color;

public static int airtel()
{
System.out.println("for call");
return 500;
}
public static int idea()
{
System.out.println("text ");
return 400 ;
}
public static int gio()
{
System.out.println("massage");
return 550;
}
}
class Airtel extends Sim
{


}
class SimTester
{
public static void main( String args[])
{
Sim s =new Sim();
int priceOfSim1 = s.airtel();
System.out.println(" the price of sim is:"+priceOfSim1);
Sim ss =new Sim();
int priceOfSim2 = ss.idea();
System.out.println(" the price of sim is:"+priceOfSim2);
Sim sss =new Sim();
int priceOfSim3 = sss.gio();
System.out.println(" the price of sim is:"+priceOfSim3);
}
} 