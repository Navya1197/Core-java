class BookTester
{
public static void main(String args[])
{
Book noteBook = new Book();

noteBook.cost = 35;
noteBook.color = "black";
noteBook.name = "merit";
noteBook.length = 25.9f;
noteBook.brand = "merit54";
System.out.println(noteBook.cost + "  "+noteBook.name+ "  "+noteBook.length+ " "+noteBook.brand);

Book workBook = new Book();

workBook.cost =45;
workBook.color = "white";
workBook.name = "classMate";
workBook.length = 30.7f;
workBook.brand = "classmate4a";
System.out.println(workBook.cost +"  "+workBook.color+"  "+workBook.name+" "+workBook.length +" "+workBook.brand);

Book recordBook  = new Book();

recordBook.cost =50;
recordBook.color ="blue";
recordBook.name = "chandra";
recordBook.length = 30.5f;
recordBook.brand ="chandra56";
System.out.println(recordBook.cost +"  "+recordBook.color+"  "+recordBook.name+" "+recordBook.length+ " "+recordBook.brand);

Book blueBook  = new Book();

blueBook.cost =10;
 blueBook.color ="blue";
 blueBook.name = "chandras";
 blueBook.length = 30.5f;
 blueBook.brand ="chandra56";
System.out.println( blueBook.cost +"  "+ blueBook.color+"  "+ blueBook.name+" "+ blueBook.length+ " "+ blueBook.brand);




}
}