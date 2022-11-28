class Laptops1
{
public static double findLaptops(String laptops)
{
if(laptops=="acer")
{
System.out.println("acer is available");
return 350000.50;
}
if(laptops=="dell")
{
System.out.println("dell is available");
return 550000.50;
}
else
{
System.out.println("laptop is not available");
return 0.0;
}
}
}
