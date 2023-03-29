package com.xworkz.springApp;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {

public static void main(String[] args) {
	
ApplicationContext application =new AnnotationConfigApplicationContext(SpringConfiguration.class);
Person per=application.getBean(Person.class);
System.out.println(per);

String str1  =application.getBean("string1",String.class);
System.out.println(str1);

String str2  =application.getBean("string2",String.class);
System.out.println(str2);

String str3  =application.getBean("string3",String.class);
System.out.println(str3);


String str4  =application.getBean("string4",String.class);
System.out.println(str4);

String str5  =application.getBean("string5",String.class);
System.out.println(str5);

Integer in1 =application.getBean("int1",Integer.class);
System.out.println(in1);

Integer in2 =application.getBean("int2",Integer.class);
System.out.println(in2);

Integer in3 =application.getBean("int3",Integer.class);
System.out.println(in3);

Integer in4 =application.getBean("int4",Integer.class);
System.out.println(in4);

Integer in5 =application.getBean("int5",Integer.class);
System.out.println(in5);


Double db1= application.getBean("double1",Double.class);
System.out.println(db1);

Double db2= application.getBean("double2",Double.class);
System.out.println(db2);

Double db3= application.getBean("double3",Double.class);
System.out.println(db3);

Double db4= application.getBean("double4",Double.class);
System.out.println(db4);

Double db5= application.getBean("double5",Double.class);
System.out.println(db5);

Byte bt1 =application.getBean("byte1",Byte.class);
System.out.println(bt1);

Byte bt2 =application.getBean("byte2",Byte.class);
System.out.println(bt2);

Byte bt3 =application.getBean("byte3",Byte.class);
System.out.println(bt3);

Byte bt4 =application.getBean("byte4",Byte.class);
System.out.println(bt4);

Byte bt5 =application.getBean("byte5",Byte.class);
System.out.println(bt5);

Float ft =application.getBean(Float.class);
System.out.println(ft);

Character ch =application.getBean(Character.class);
System.out.println(ch);

Short  st= application.getBean(Short.class);
System.out.println(st);

Long lg =application.getBean(Long.class);
System.out.println(lg);

Boolean bl =application.getBean(Boolean.class);
System.out.println(bl);

Scanner bh = application.getBean(Scanner.class);
System.out.println(bh);




}
}