class House
{
public int id;
public String name;
public String location;
public String ownerName;
public String[] familyMembers;
public House(String location, String name, int id,String ownerName, String[] familyMembers)
{
this.id = id;
this.name = name ;
this.location = location ;
this.ownerName = ownerName;
this.familyMembers = familyMembers;
}
public void displayDetails()
{
System.out.println("displaying house info");
System.out.println("the location of the house ");
System.out.println("the name of the house is "+this.name);
System.out.println("the  id of the  house "+this.id);
System.out.println("the  ownername of the house "+this.ownerName);
System.out.println("the familyMembers  of the ");
for (int index =0; index< familyMembers.length; index++)
{	
System.out.println(familyMembers[index]);
}
}
}
