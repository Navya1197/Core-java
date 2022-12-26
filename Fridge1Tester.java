class Fridge1Tester
{
public static void main(String args[])
{ 
Fridge1 iceBox =new Fridge1();
System.out.println(iceBox.color + "  "+iceBox.shape+ "  "+iceBox.price+ " "+iceBox.type);
Fridge1 iceBox1 = new Fridge1("gray","rectangle","1200","plastic");
System.out.println(iceBox1.color + "  "+iceBox1.shape+ "  "+iceBox1.price+ " "+iceBox1.type);
}
}