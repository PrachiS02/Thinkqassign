package com.customexception;

import java.util.Scanner;


public class Nameaccept {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name:");
		String name=sc.next();
		try
		{
		if(name.length()<3)
             throw new InvalidNameException("name shoud be greater than 3 character");
	        System.out.println("name is  :"+name);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
