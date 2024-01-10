package com.basics;

public class CompareToMethod {

	public static void main(String[] args) {
		
      //lexographically:dictionary
		
		System.out.println("Pranay".compareTo("Pranali"));
		System.out.println("Abha".compareTo("Bhumi"));//65-66=-1
		
		System.out.println("Bhumi".compareTo("Abha"));//66-65=1
		
		System.out.println("Bhumi".compareTo("Bhumi"));//same=0
		
		//return type int 
		
		String s1="Reetu";
		String s2="Rina";
		
		System.out.println(s1.length()>s2.length());
		
		System.out.println(s1.compareTo(s2));
		
	  
		
		
		
	}

}
