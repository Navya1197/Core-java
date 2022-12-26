class Country
{
String name;

public static void india()
{
System.out.println("beautiful");
return;
}
public static void shrilanka()
{
System.out.println("near country");
return;
}
public static void china()
{
System.out.println("country");
return;
}
}
class India extends Country
{


}
class CountryTester
{
public static void main( String args[])
{
Country i = new Country();
i.india();
Country ii = new Country();
ii.shrilanka();
Country iii = new Country();
iii.china();
}
} 