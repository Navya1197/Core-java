class Programming
{
String name;

public static void java()
{
System.out.println("difficult");
return;
}
public static void c()
{
System.out.println("understand");
return;
}
public static void python()
{
System.out.println("easy");
return;
}
}
class Java extends Programming
{


}
class ProgrammingTester
{
public static void main( String args[])
{
Programming i = new Programming();
i.java();
Programming ii = new Programming();
ii.c();
Programming iii = new Programming();
iii.python();
}
} 