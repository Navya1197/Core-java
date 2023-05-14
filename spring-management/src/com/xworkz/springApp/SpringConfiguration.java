package com.xworkz.springApp;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //bean
public class SpringConfiguration {

@Bean //can be used for both .classn files- means String,int  /.java files- means any object
public Person getPerson()
{
Person per =new Person();
per.setId(1);
per.setName("nav");
return per;
}
 @Bean(name="string1")
 public String getString1()
{
	return "we will learn spring";
}
 
 @Bean(name="string2")
 public String getString2()
{
	return "to be managed by Spring application";
}
 @Bean(name="string3")
 public String getString3()
{
	return "we will learn jdbc";
}
 @Bean(name="string4")
 public String getString4()
{
	return "we will learn sql";
}
 @Bean(name="string5")
 public String getString5()
{
	return "we will learn web";
}
 @Bean(name="int1")
 public int getInt1()
 {
	 return 124;
 }
 @Bean(name="int2")
 public int getInt2()
 {
	 return 25;
 }
 @Bean(name="int3")
 public int getInt3()
 {
	 return 206;
 }
 @Bean(name="int4")
 public int getInt4()
 {
	 return 25;
 }
 @Bean(name="int5")
 public int getInt5()
 {
	 return 25;
 }
 
 @Bean(name="double1")
 public double getDouble1()
 {
	 return 378.88;
 }
 @Bean(name="double2")
 public double getDouble2()
 {
	 return 395.88;
 }
 @Bean(name="double3")
 public double getDouble3()
 {
	 return 305.88;
 }
 @Bean(name="double4")
 public double getDouble4()
 {
	 return 388.88;
 }
 @Bean(name="double5")
 public double getDouble5()
 {
	 return 395.88;
 }
 @Bean(name="byte1")
 public byte getByte1()
 {
	 return 123;
 }
 @Bean(name="byte2")
 public byte getByte2()
 {
	 return 123;
 }
 @Bean(name="byte3")
 public byte getByte3()
 {
	 return 12;
 }
 @Bean(name="byte4")
 public byte getByte4()
 {
	 return 122;
 }
 @Bean(name="byte5")
 public byte getByte5()
 {
	 return 123;
 }
 @Bean
 public float getFloat()
 {
	 return 12.7f;
 }
 @Bean
 public char getChar()
 {
	 return 'A';
 }
 @Bean 
 public short getShort()
 {
	 return 342;
 }
 @Bean
 public long getLong()
 {
	return 23113134l; 
 }
 @Bean
 public boolean getBoolean()
 {
	 return true;
 }
 @Bean
 public Scanner getScanner()
 {
	 return new Scanner(System.in);
 }
 

}

