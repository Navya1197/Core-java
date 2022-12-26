class ShopMallTester
{
public static void main(String nav[])
{
System.out.println("main method is started");
ShopMall mall = new ShopMall();
Shop sn = new Shop("nav","mysore",7654);
mall.fetch(sn);
mall.getDisplay();
System.out.println("main method is ended");



}
}
