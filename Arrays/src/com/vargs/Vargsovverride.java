//we cant override vrags
package com.vargs;
class Parent
{
	public static void display(int ...ar)
	{
		int sum=0;
		System.out.println("In int");
		for(int a:ar)
		{
			sum+=a;
		}
		System.out.println(sum);
	}

}
class Child extends Parent
{
//	//@override
//	public static void display(int ...ar)
//	{
//		int sum=0;
//		System.out.println("In int");
//		for(int a:ar)
//		{
//			sum+=a;
//		}
//		System.out.println(sum);
//	}

}
public class Vargsovverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
