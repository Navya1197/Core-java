class FridgeTester
{
public static void main(String args[])
{ 
Fridge iceBox = new Fridge();
System.out.println(iceBox.color + "  "+iceBox.shape+ "  "+iceBox.price+ " "+iceBox.type);

iceBox.color = "red";
iceBox.shape ="rectangle";
iceBox.price = "15000";
iceBox.type = "metal";
System.out.println(iceBox.color + "  "+iceBox.shape+ "  "+iceBox.price+ " "+iceBox.type);

Fridge cooler = new Fridge();
System.out.println(cooler.color +"  "+cooler.shape+"  "+cooler.price+" "+cooler.type);

cooler.color ="blue";
cooler.shape = "rectangle";
cooler.price = "20000";
cooler.type = "plastic";
System.out.println(cooler.color +"  "+cooler.shape+"  "+cooler.price+" "+cooler.type);

Fridge coolBox = new Fridge();
System.out.println(coolBox.color +"  "+coolBox.shape+"  "+coolBox.price+" "+coolBox.type);

coolBox.color ="perple";
coolBox.shape = "square";
coolBox.price = "25000";
coolBox.type = "copper";
System.out.println(coolBox.color +"  "+coolBox.shape+"  "+coolBox.price+" "+coolBox.type);

Fridge coolItem = new Fridge();
System.out.println(coolItem.color +"  "+coolItem.shape+"  "+coolItem.price+" "+coolItem.type);

coolItem.color ="black";
coolItem.shape = "square";
coolItem.price = "35000";
coolItem.type = "copper";
System.out.println(coolItem.color +"  "+coolItem.shape+"  "+coolItem.price+" "+coolItem.type);
}
}