class Book
{
String name;
public static int write()
{
System.out.println("writing purpose");
return 30;
}
public static void read()
{
System.out.println("for reading pupose");	
}
}
class Classmate extends Book
{
	
	
}
class BookTester
{
public static void main(String Args[])
{
System.out.println("main method is created");
Book B = new Book();
int priceOfBook= B.write();
System.out.println("price of Book is :"+priceOfBook);
Book bk =new Book();
bk.read();
System.out.println("main method is ended");
}	
}
