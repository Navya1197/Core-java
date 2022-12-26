class Developer
{
String name;

public static void ranju()
{
System.out.println("java developer");
return;
}
public static void sindu()
{
System.out.println(" software testing");
return;
}
public static void aksha()
{
System.out.println("python developer");
return;
}
}
class Ranju extends Developer
{


}
class DeveloperTester
{
public static void main( String args[])
{
Developer i = new Developer();
i.ranju();
Developer ii = new Developer();
ii.sindu();
Developer iii = new Developer();
iii.aksha();
}
} 