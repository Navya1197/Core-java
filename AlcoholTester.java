class Alcohol
{
String name;

public static void oldMonk()
{
System.out.println("good");
return ;
}
public static void oldMonk1()
{
System.out.println("not bad");
return ;
}
public static void oldMonk2()
{
System.out.println("nice");
return ;
}
}
class OldMonk extends Alcohol
{


}
class AlcoholTester
{
public static void main( String args[])
{
Alcohol c =new Alcohol();
c.oldMonk();
Alcohol cc =new Alcohol();
cc.oldMonk1();
Alcohol ccc =new Alcohol();
ccc.oldMonk2();
}
} 