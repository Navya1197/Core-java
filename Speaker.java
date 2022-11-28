class Speaker
{
static String brandName = "Bose";
static String frequency =" 120hz";
static boolean isWireless =true;
static boolean isConnected;
static int minVolume;
static int maxVolume =6;
static int currentVolume;
public static void main(String a[])
{
System.out.println(" main method is stated");
onOrOff();
increaseVolume();
decreaseVolume();	
System.out.println(" main method is ended");
}
public static void onOrOff()
{
if(isConnected == false)
{
isConnected =true;
System.out.println("speaker is turned on");
}
else 
{
System.out.println("speaker is turned off");
}
}


public static void increaseVolume()
{
if(isConnected == true)
{
if(currentVolume<maxVolume)
{
currentVolume =currentVolume+1;
System.out.println(" current volume is :"+currentVolume);
}
}
else
{
System.out.println(" Max volume is reached");	
}
}

public static void decreaseVolume()
{
if(isConnected == true)
{
if(currentVolume>minVolume)
{
currentVolume =currentVolume-1;
System.out.println(" current volume is :"+currentVolume);
}
}
else
{
System.out.println(" min volume is reached");	
}
}
}




