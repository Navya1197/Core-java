class Chips
{
String name;

public static void Bingo()
{
System.out.println("for crunchy");
return ;
}
public static void kurkure()
{
System.out.println("enjoying ");
return ;
}
public static void lays()
{
System.out.println("snacks");
return ;
}
}
class Bingo extends Chips
{


}
class ChipsTester
{
public static void main( String args[])
{
Chips c =new Chips();
c.Bingo();
Chips cc =new Chips();
cc.kurkure();
Chips ccc =new Chips();
ccc.lays();
}
} 