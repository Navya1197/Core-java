class  TheatreTester
{
public static void main(String args[])
{
String location[]={"vvpuram","vijaynagara"};
String typesOfScreens[]={"fixedframe","projector"};

Theatre show =new Theatre(location,"putta",67,"kumar",typesOfScreens);
show.displayDetails();
}
}