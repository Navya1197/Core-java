class Chocolate
{
String name;

public static void dairyMilk()
{
System.out.println("for sweetness");
return ;
}
public static void milkyBar()
{
System.out.println("enjoying ");
return ;
}
public static void kitkat()
{
System.out.println("sweet");
return ;
}
}
class DairyMilk extends Chocolate
{


}
class ChocolateTester
{
public static void main( String args[])
{
Chocolate c =new Chocolate();
c.dairyMilk();
Chocolate cc =new Chocolate();
cc.milkyBar();
Chocolate ccc =new Chocolate();
ccc.kitkat();
}
} 