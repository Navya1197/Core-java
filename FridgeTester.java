class Fridge
{
String name;

public static void lg()
{
System.out.println("good");
return ;
}
public static void lg1()
{
System.out.println("not bad");
return ;
}
public static void lg2()
{
System.out.println("nice");
return ;
}
}
class Lg extends Fridge
{


}
class FridgeTester
{
public static void main( String args[])
{
Fridge c =new Fridge();
c.lg();
Fridge cc =new Fridge();
cc.lg1();
Fridge ccc =new Fridge();
ccc.lg2();
}
} 