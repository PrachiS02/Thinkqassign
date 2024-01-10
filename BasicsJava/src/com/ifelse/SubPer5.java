package com.ifelse;

import java.util.Scanner;

public class SubPer5 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		float per;
		
		System.out.println("Enter the name : ");
		String name =sc.next();
		System.out.println("Enter the Marks of 5 subject : ");
		float sub1=sc.nextFloat();
		float sub2=sc.nextFloat();
		float sub3=sc.nextFloat();
		float sub4=sc.nextFloat();
		float sub5=sc.nextFloat();
		per=((sub1+sub2+sub3+sub4+sub5)/500)*100;
		System.out.println("percenatge : "+per+"%");
		
		if(per>=40)
			System.out.println(name+"has cleared the exam with " +per+"%");
		else
			System.out.println(name+"has failed the exam with " +per+"%");
			
			
		
		
		

	}

}
