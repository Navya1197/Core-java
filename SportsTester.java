class Sports
{
String name;

public static void cricket()
{
System.out.println("for entertainment");
return ;
}
public static void kabbadi()
{
System.out.println("enjoying ");
return ;
}
public static void koko()
{
System.out.println("game");
return ;
}
}
class Cricket extends Sports
{


}
class SportsTester
{
public static void main( String args[])
{
Sports s =new Sports();
s.cricket();
Sports ss =new Sports();
ss.kabbadi();
Sports sss =new Sports();
sss.koko();
}
} 