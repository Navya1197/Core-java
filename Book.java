class Book
{
int cost;
String color;
String name;
int pages;
public  Book()
{
System.out.println("default constructor");	
} 
public Book(int cst, String clr, String nme, int pges)
{
System.out.println("parameterized constructor");
cost = cst;
color = clr;
name = nme;
pages = pges;
}
}