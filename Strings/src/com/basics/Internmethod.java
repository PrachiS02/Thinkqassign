package com.basics;

public class Internmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="Java";
        String s2=new String("Java");
        
        System.out.println(s1==s2);
        s2=s2.intern();
        
        System.out.println(s1==s2);
	}

}
