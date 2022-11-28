class Flipcart
{
static String electronicsItems[]={"phones", "fans", "kattle", "charger", "adopter"};
public static void main(String args[])
{
getElectronicsItems();
}
public static void getElectronicsItems()
{
for(int i=0; i<electronicsItems.length; i++)
{
System.out.println(electronicsItems[i]);
}
}
}