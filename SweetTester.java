class SweetTester
{
public static void main(String args[])
{
Sweet mahaLakshmiSweet = new Sweet();

mahaLakshmiSweet.cost = 100;
mahaLakshmiSweet.color = "yellow";
mahaLakshmiSweet.name = "barfi";

System.out.println(mahaLakshmiSweet.cost + "  "+mahaLakshmiSweet.color+ "  "+mahaLakshmiSweet.name);

Sweet indianSweets = new Sweet();

indianSweets.cost =95;
indianSweets.color = "brown";
indianSweets.name = "jamun";

System.out.println(indianSweets.cost +"  "+indianSweets.color+"  "+indianSweets.name);

Sweet popularSweet  = new Sweet();

popularSweet.cost =50;
popularSweet.color ="peda";
popularSweet.name = "white";

System.out.println(popularSweet.cost +"  "+popularSweet.color+"  "+popularSweet.name);

Sweet mysoreSweet  = new Sweet();

mysoreSweet.cost =100;
mysoreSweet.color ="mysurepak";
mysoreSweet.name = "yellow";

System.out.println(mysoreSweet.cost +"  "+mysoreSweet.color+"  "+mysoreSweet.name);
}
}