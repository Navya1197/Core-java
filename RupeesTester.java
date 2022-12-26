class RupeesTester
{
public static void main(String args[])
{
System.out.println("main method is started");
Rupees.noOfLanguage = 15;
Rupees rupi = new Rupees(1, "56774378", "100 rupees",2020,"paper", "purple","rajan");
System.out.println(rupi.indianRupeesId +" " +rupi.noOfLanguage +" " +rupi.serialNo +" "+rupi.rupeeName +" "+rupi.yearOfPrinting +" "+rupi.type +" "+rupi.color+" "+rupi.governorName);

Rupees rupiiii = new Rupees(7, "567743677", "20 rupees",2022,"paper", "blue","rajan");
System.out.println(rupiiii.indianRupeesId +" " +rupiiii.noOfLanguage +" " +rupiiii.serialNo +" "+rupiiii.rupeeName +" "+rupiiii.yearOfPrinting +" "+rupiiii.type +" "+rupiiii.color+" "+rupiiii.governorName);

Rupees rupiiiii = new Rupees(9, "56774379", "50 rupees",2019,"paper", "green","rajan");
System.out.println(rupiiiii.indianRupeesId +" " +rupiiiii.noOfLanguage +" " +rupiiiii.serialNo +" "+rupiiiii.rupeeName +" "+rupiiiii.yearOfPrinting +" "+rupiiiii.type +" "+rupiiiii.color+" "+rupiiiii.governorName);

Rupees rupiiiiii = new Rupees(8, "56774376","10 rupees",2018,"paper", "red","rajan");
System.out.println(rupiiiiii.indianRupeesId +" " +rupiiiiii.noOfLanguage +" " +rupiiiiii.serialNo +" "+rupiiiiii.rupeeName +" "+rupiiiiii.yearOfPrinting +" "+rupiiiiii.type +" "+rupiiiiii.color +" "+rupiiii.governorName);

System.out.println("main method is ended");

}
}  