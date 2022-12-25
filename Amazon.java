class Amazon
{
static String englishWebSeries[]={"ozark", "the women in house", "sweet mangonolias" ,"inventing anna", "brigade", "bridgerton", "the ultimatatum", "heartstopper", "anatomy","russian" };
static String hindiWebSeries[]={"Tubelight", "Ellindabarthironeevella", "Dovemanja" ,"Kyaabre", "inti ninna", "honeymoon", "the other lovestory"};
public static void main(String a[])
{
System.out.println(" main method is stated");
  getEnglishWebSeries();
  getHindiWebSeries();
System.out.println(" main method is ended");
}



public static void getEnglishWebSeries()
{
for( int i=0; i<englishWebSeries.length; i++)
{
System.out.println(englishWebSeries[i]);	
}
}
public static void getHindiWebSeries()
{
for( int i=0; i<hindiWebSeries.length; i++)
{
System.out.println(hindiWebSeries[i]);	
}
}
}