class Plastic
{
String name;

public static void Bottle1()
{
System.out.println("for drinking");
return ;
}
public static void Bottle2()
{
System.out.println("liquid store");
return ;
}
public static void Bottle3()
{
System.out.println("for hot water");
return ;
}
}
class Bottle extends Plastic
{


}
class PlasticTester
{
public static void main( String args[])
{
Plastic p =new Plastic();
p.Bottle1();
Plastic pp =new Plastic();
pp.Bottle2();
Plastic ppp =new Plastic();
ppp.Bottle3();
}
} 