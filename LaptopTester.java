class LaptopTester
{
public static void main(String args[])
{
Laptop microComputer = new Laptop();

microComputer.cost = 35000;
microComputer.color = "black";
microComputer.name = "acer";
microComputer.length = 25.9f;
microComputer.brand = "acer123";
System.out.println(microComputer.cost + "  "+microComputer.name+ "  "+microComputer.length+ " "+microComputer.brand);

Laptop miniComputer = new Laptop();

miniComputer.cost =45000;
miniComputer.color = "white";
miniComputer.name = "dell";
miniComputer.length = 20.7f;
miniComputer.brand = "dell34a";
System.out.println(miniComputer.cost +"  "+miniComputer.color+"  "+miniComputer.name+" "+miniComputer.length +" "+miniComputer.brand);

Laptop lap  = new Laptop();

lap.cost =50000;
lap.color ="blue";
lap.name = "hp";
lap.length = 30.5f;
lap.brand ="hp12b";
System.out.println(lap.cost +"  "+lap.color+"  "+lap.name+" "+lap.length+ " "+lap.brand);

Laptop system  = new Laptop();

system.cost =50000;
system.color ="blue";
system.name = "lonovo";
system.length = 30.5f;
system.brand ="hp12b";
System.out.println(system.cost +"  "+system.color+"  "+system.name+" "+system.length+ " "+system.brand);
}
}