class State
{
String name;

public static void karnataka()
{
System.out.println("beautiful");
return;
}
public static void thamilnadu()
{
System.out.println("near state");
return;
}
public static void bidar()
{
System.out.println("far state");
return;
}
}
class Karnataka extends State
{


}
class StateTester
{
public static void main( String args[])
{
State i = new State();
i.karnataka();
State ii = new State();
ii.thamilnadu();
State iii = new State();
iii.bidar();
}
} 