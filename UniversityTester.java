class University
{
String name;

public static void vtu()
{
System.out.println("good");
return ;
}
public static void vtu1()
{
System.out.println("not bad");
return ;
}
public static void vtu2()
{
System.out.println("bad");
return ;
}
}
class Vtu extends University
{


}
class UniversityTester
{
public static void main( String args[])
{
University c =new University();
c.vtu();
University cc =new University();
cc.vtu1();
University ccc =new University();
ccc.vtu2();
}
} 