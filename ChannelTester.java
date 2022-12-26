class Channel
{
String name;

public static void discovery()
{
System.out.println("good");
return ;
}
public static void discovery1()
{
System.out.println("animals");
return ;
}
public static void discovery2()
{
System.out.println("not bad");
return ;
}
}
class Discovery extends Channel
{


}
class ChannelTester
{
public static void main( String args[])
{
Channel c =new Channel();
c.discovery();
Channel cc =new Channel();
cc.discovery1();
Channel ccc =new Channel();
ccc.discovery2();
}
} 