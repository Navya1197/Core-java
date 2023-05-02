package com.xworkz.area;

import java.util.Scanner;

public class AreaTester {

public static void main(String args[])

{
	Scanner sc = new Scanner(System.in);
	Area ar =new Area();
	System.out.println("enter the name");
	ar.setName(sc.next());
	System.out.println("enter the code");
	ar.setCode(sc.nextInt());
	System.out.println("enter the block");
	ar.setBlock(sc.nextInt());
System.out.println(ar.getName()+" "+ar.getCode()+" "+ar.getBlock());
sc.close();
}

}
