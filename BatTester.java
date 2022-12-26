class Bat
{
String name;

public static void mrf()
{
System.out.println("good");
return ;
}
public static void mrf1()
{
System.out.println("not bad");
return ;
}
public static void mrf2()
{
System.out.println("nice");
return ;
}
}
class Mrf extends Bat
{


}
class BatTester
{
public static void main( String args[])
{
Bat c =new Bat();
c.mrf();
Bat cc =new Bat();
cc.mrf1();
Bat ccc =new Bat();
ccc.mrf2();
}
} 