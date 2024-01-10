package com.basics;

public class Stringequalsorotequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s1="Hello";
          String s2="Hello";
          
          String s3=new String("Hello");
          String s4=new String("Hello");
          
          System.out.println(s1==s2);//true compare references
          System.out.println(s1.equals(s2));//true compare val
        
          System.out.println("-------------------------");
          System.out.println(s1==s3);//id not same
          System.out.println(s1.equals(s3));//value  is same
          
          System.out.println("---------------------------");
          System.out.println(s4==s3);
          System.out.println(s4.equals(s3));
          
	}

}
