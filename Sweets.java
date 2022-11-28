class Sweets
{
public static int findSweets(String sweets)
{
if(sweets=="peda")
{
System.out.println("sweet is available");
return 25;
}
if(sweets=="jamun")
{
System.out.println("sweet is available");
return 40;
}
else
{
System.out.println("sweet is not available");
return 0;
}
}
}