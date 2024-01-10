package com.basics;

public class CreateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s1="Hello";
          String s2="Hello";
          
          System.out.println(s1.hashCode());
          System.out.println(s2.hashCode());
          
          String s3=new String("hello");
          
          System.out.println(s3.hashCode());
          //hashcode --> memory ref of hello and not s3
          //id of s1 and s2 is same diff for s3
	}

}
