class Rupees
{
public int indianRupeesId;
public  static int noOfLanguage;
public String serialNo;
public String rupeeName;
public int yearOfPrinting;
public String type;
public String color;
public String governorName;
public Rupees(int id,  String Sn, String rn, int yrpr, String tp, String clr, String gn)
{
indianRupeesId = id;
//noOfLanguage =lg;
serialNo = Sn;
rupeeName = rn;
yearOfPrinting = yrpr;
type = tp;
color = clr;
governorName = gn;
}

public void buyThings()
{
System.out.println("for buy the things");	
}
}