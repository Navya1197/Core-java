class Netflix
{
static String hindiWebSeries[]={"ozark", "the women in house", "sweet mangonolias" ,"inventing anna", "brigade", "bridgerton", "the ultimatatum", "heartstopper", "anatomy","russian" };
static String kannadaWebSeries[]={"Tubelight", "Ellindabarthironeevella", "Dovemanja" ,"Kyaabre", "inti ninna", "honeymoon", "the other lovestory"};
public static void main(String a[])
{
System.out.println(" main method is stated");
  hndWebSeries();
  kndWebSeries();
System.out.println(" main method is ended");
}



public static void hndWebSeries()
{
for( int i=0; i<hindiWebSeries.length; i++)
{
System.out.println(hindiWebSeries[i]);	
}

public static void kndWebSeries()
{
for( int i=0; i<kannadaWebSeries.length; i++)
{
System.out.println(kannadaWebSeries[i]);	
}
}
}