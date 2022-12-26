class Stationery
{
public int id;
public String name;
public String[] noteBook;
public String[] pen;
public String[] charts;
public Stationery(int id, String name,String[] noteBook,String[] pen, String[] charts)
{
this.id = id;
this.name = name;
this.noteBook = noteBook ;
this.pen = pen;
this.charts = charts;
}
public void displayDetails()
{
System.out.println("displaying stationery info");
System.out.println("the id of the stationery is "+this.id);
System.out.println("the  name of the stationery is "+this.name);
System.out.println("the  noteBook of stationery ");
System.out.println("the  pens of the stationery ");
System.out.println("the charts of the stationery");
for (int index =0; index< noteBook.length; index++)
{	
System.out.println(noteBook[index]);
}
for(int index = 0; index<pen.length; index++)
{
System.out.println(pen[index]);	
}
for (int index =0; index<charts.length; index++)
{	
System.out.println(charts[index]);
}
}
}
