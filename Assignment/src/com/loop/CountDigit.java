package com.loop;

import java.util.Scanner;

public class CountDigit 
{

	public static int countdigits(int n)
	{
		int cnt=0;
		while(n!=0)
		{
			n=n/10;
			cnt++;
		}
		return cnt;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number : ");
		int num=sc.nextInt();
		 System.out.println("count of digits : "+countdigits(num));
		
		
	}

}
