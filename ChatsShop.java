class ChatsShop
{
public int id ;//=id;
public String name; //=name;
public String chatNames[];//= chatNames;
public ChatsShop(int id,String name,String[] chatNames)
{
this.id =id;
this.name= name;
this.chatNames =chatNames;
}
public  void displayDetails()
{
System.out.println("chatshop informations are");
System.out.println("the chatsShop id is:"+this.id);
System.out.println("the chatsshop name is :"+this.name);
System.out.println("the chats names are");
for(int i=0; i<chatNames.length; i++)
{
System.out.println(chatNames[i]);
}
}
}