class  RestuarantTester
{
public static void main(String args[])
{
String workers[]={"kavya","hemanth"};
String menu[]={"gobi","masala"};

Restuarant rest =new Restuarant("mysore","greenleaf",65,workers,menu);
rest.displayDetails();

Restuarant restful =new Restuarant("mysore","thaj",56,workers,menu);
restful.displayDetails();



//System.out.println(rest.name+"  "+rest.location+" "+rest.id+" "+rest.workers);
}
}
//groceryShop -id,name,location[],ownername, items[]
//stationary -id, name, notebooks[],pens[],chat
//theater id -id, name, noOfscreen,typesOfScreen[]
//house -id,