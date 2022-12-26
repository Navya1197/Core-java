class Bag
{
String name;

public static void wildcraft()
{
System.out.println("good");
return ;
}
public static void wildcraft1()
{
System.out.println("comfortable");
return ;
}
public static void wildcraft2()
{
System.out.println("not bad");
return ;
}
}
class Wildcraft extends Bag
{


}
class BagTester
{
public static void main( String args[])
{
Bag c =new Bag();
c.wildcraft();
Bag cc =new Bag();
cc.wildcraft1();
Bag ccc =new Bag();
ccc.wildcraft2();
}
} 