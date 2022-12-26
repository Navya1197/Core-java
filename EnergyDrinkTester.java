class EnergyDrink
{
String name;

public static void redbull()
{
System.out.println("good");
return ;
}
public static void redbull1()
{
System.out.println("not bad");
return ;
}
public static void redbull2()
{
System.out.println("bad");
return ;
}
}
class RedBull extends EnergyDrink
{


}
class EnergyDrinkTester
{
public static void main( String args[])
{
EnergyDrink c =new EnergyDrink();
c.redbull();
EnergyDrink cc =new EnergyDrink();
cc.redbull1();
EnergyDrink ccc =new EnergyDrink();
ccc.redbull2();
}
} 