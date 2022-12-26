class MobileTester
{
public static void main(String args[])
{
Mobile handPhone = new Mobile();

handPhone.cost = 14000;
handPhone.color ="black";
handPhone.name = "redmi";
handPhone.length = 16.9f;
handPhone.brand = "redminote9";
System.out.println(handPhone.cost + "  "+handPhone.name+ "  "+handPhone.length+ " "+handPhone.brand);

Mobile phone = new Mobile();

phone.cost =13000;
phone.color = "white";
phone.name = "oppo";
phone.length = 14.7f;
phone.brand = "opponote5";
System.out.println(phone.cost +"  "+phone.color+"  "+phone.name+" "+phone.length +" "+phone.brand);

Mobile cellPhone  = new Mobile();

cellPhone.cost =12000;
cellPhone.color ="blue";
cellPhone.name = "moto";
cellPhone.length = 15.5f;
cellPhone.brand ="motonote12";
System.out.println(cellPhone.cost +"  "+cellPhone.color+"  "+cellPhone.name+" "+cellPhone.length+ " "+cellPhone.brand);
}
}