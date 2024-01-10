package com.vargs;

public class Vargsrule {

	//Rule1: only 1 vargs as argument
	
//	static void display(int ..a,int ...b)
//	{
//		
//	}
	//Rule1: vrags has to be last as argument
	static void display(int a1,int ...b1)
	{
		System.out.println(a1);
		for(int a:b1)
			System.out.print(a+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       display(1,2,3,4);
	}

}
