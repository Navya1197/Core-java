class  GroceryShopTester
{
public static void main(String args[])
{
String location[]={"vvpuram","vijaynagara"};
String items[]={"icecreams","sweets"};

GroceryShop grocery =new GroceryShop(location,"putta",67,"kumar",items);
grocery.displayDetails();
}
}