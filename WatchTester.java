class Watch
{
String name;
public static int time()
{
System.out.println("Timing purpose");
return 1500;
}
public static void camera()
{
System.out.println("for selfi pupose");	
}
}
class Sonata extends Watch
{
	
	
}
class WatchTester
{
public static void main(String Args[])
{
System.out.println("main method is created");
Watch tm = new Watch();
int priceOfWatch =tm.time();
System.out.println("price of watch is :"+priceOfWatch);
Watch t =new Watch();
t.camera();
System.out.println("main method is ended");
}	
}
