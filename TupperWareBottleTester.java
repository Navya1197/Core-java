class TupperWareBottleTester
{
public static void main(String args[])
{
TupperWareBottle tupperWareBottle = new TupperWareBottle();

tupperWareBottle.color = "red";
tupperWareBottle.shape ="cylinder";
tupperWareBottle.price = "76";
tupperWareBottle.type = "metal";
System.out.println(tupperWareBottle.color + "  "+tupperWareBottle.shape+ "  "+tupperWareBottle.price+ " "+tupperWareBottle.type);

TupperWareBottle tupperWare = new TupperWareBottle();

tupperWare.color ="blue";
tupperWare.shape = "rectangle";
tupperWare.price = "98";
tupperWare.type = "plastic";
System.out.println(tupperWare.color +"  "+tupperWare.shape+"  "+tupperWare.price+" "+tupperWare.type);

TupperWareBottle bottle = new TupperWareBottle();

bottle.color ="perple";
bottle.shape = "square";
bottle.price = "67";
bottle.type = "copper";
System.out.println(bottle.color +"  "+bottle.shape+"  "+bottle.price+" "+bottle.type);





}
}