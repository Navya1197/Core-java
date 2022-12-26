class FruitTester
{
public static void main(String args[])
{
Fruit accessoryFruit = new Fruit();

accessoryFruit.cost = 100;
accessoryFruit.color = "red";
accessoryFruit.name = "apple";

System.out.println(accessoryFruit.cost + "  "+accessoryFruit.color+ "  "+accessoryFruit.name);

Fruit dryFruit = new Fruit();

dryFruit.cost =60;
dryFruit.color = "brown";
dryFruit.name = "badam";

System.out.println(dryFruit.cost +"  "+dryFruit.color+"  "+dryFruit.name);

Book stoneFruit  = new Book();

stoneFruit.cost =50;
stoneFruit.color ="red";
stoneFruit.name = "mango";

System.out.println(stoneFruit.cost +"  "+stoneFruit.color+"  "+stoneFruit.name);
}
}