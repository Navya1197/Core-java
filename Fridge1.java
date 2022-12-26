class Fridge1
{
  public String color;
 public String shape;
 public String price;
 public String type;
 public  Fridge1()
 {
 System.out.println("default constructor ");
 }
 public   Fridge1(String clr, String shp, String prc, String typ)
 {
 System.out.println("parameterized constructor");
 color = clr;
 shape = shp;
 price = prc;
 type = typ;
 
 }
 }