class Pencil
{
String name;
public static int write()
{
System.out.println("writing purpose");
return 15;
}
public static void erase()
{
System.out.println("for erasing pupose");	
}
}
class Apsara extends Pencil
{
	
	
}
class PencilTester
{
public static void main(String Args[])
{
System.out.println("main method is created");
Pencil p = new Pencil();
int priceOfPencil= p.write();
System.out.println("price of pencil is :"+priceOfPencil);
Pencil pp =new Pencil();
pp.erase();
System.out.println("main method is ended");
}	
}
