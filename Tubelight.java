class Tubelight
{
static boolean isConnected =false;
public static void  main(String arg[])
{
//invoking a givelight method 
   giveLight();
   //for else part
   //giveLight();
}
 //declaration of agivelight method 
public static void giveLight()
{
System.out.println("givelight method is connected");
if(isConnected==false)
{
isConnected=true; 
System.out.println("tubelight is on");
}
else
{
System.out.println("tubelight is off");
}
System.out.println("giveLight method is ended");
}
}
 
