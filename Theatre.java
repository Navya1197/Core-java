class Theatre
{
public int id;
public String name;
public String[] location;
public String ownerName;
public String[] typesOfScreens;
public Theatre(String[] location, String name, int id,String ownerName, String[] typesOfScreens)
{
this.id = id;
this.name = name ;
this.location = location ;
this.ownerName = ownerName;
this.typesOfScreens = typesOfScreens;
}
public void displayDetails()
{
System.out.println("displaying theatre info");
System.out.println("the location of the theatre ");
System.out.println("the name of the theatre is "+this.name);
System.out.println("the  id of the  theatre "+this.id);
System.out.println("the  ownername of the theatre "+this.ownerName);
System.out.println("the ofScreens of the theatre");
for (int index =0; index< location.length; index++)
{	
System.out.println(location[index]);
}
for(int index = 0; index<typesOfScreens.length; index++)
{
System.out.println(typesOfScreens[index]);	
}
}
}
