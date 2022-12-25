class Multiplication
{
public static void main(String mul[])
{
	System.out.println("main started");
	//invoking a method or calling a mathod 
	//arguments are 765 and 675
mul(2,6);
// invoking a method
mul(7,2);
mul(9,2);
mul(3,6);
mul(2,2,3);
System.out.println("main ended");
}
public static void mul(int number1, int number2)
{
System.out.println(number1*number2);

}
public static void mul(int number1, int number2,int number3)
{
System.out.println(number1*number2*number3);	
}
}
