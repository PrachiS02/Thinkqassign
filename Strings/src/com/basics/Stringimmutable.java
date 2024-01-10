package com.basics;

public class Stringimmutable
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s1="java";
          String s2="java";//scp
          System.out.println(s1);
          System.out.println(s2);
          
          s1.concat("proggram");//here "program" is only creatde in heap and not in scp beacuse concat return string which is created in heap 
          
          System.out.println(s1);
          String s3="Javaprogram";
          
          s1=s1+"Program";//only in heap
          System.out.println(s1);
	}

}
