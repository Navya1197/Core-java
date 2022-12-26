class District
{
String name;

public static void mysore()
{
System.out.println(" very beautiful");
return;
}
public static void mandya()
{
System.out.println("krs");
return;
}
public static void chamarajanagara()
{
System.out.println("temples");
return;
}
}
class Mysore extends District
{


}
class DistrictTester
{
public static void main( String args[])
{
District i = new District();
i.mysore();
District ii = new District();
ii.mandya();
District iii = new District();
iii.chamarajanagara();
}
} 