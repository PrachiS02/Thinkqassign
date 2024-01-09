package labsession;

import java.util.Scanner;

public class EvenOddDiv {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number : ");
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println(num+" is even number ");
		
		    if(num%6==0)
		    {
		    	System.out.println(num+" is divisible by 6");
		    }
		    else
		    {
		    	System.out.println(num+" is not divisible by 6");
		    }
		}
		else
		{
		    System.out.println(num+" is odd number");
		    if(num%5==0)
		    {
		    	System.out.println(num+" is divisible by 5 ");
		    }
		    else
		    {
		    	System.out.println(num+" is not divisible by 5 ");
		    }
		    	
		 }
	}
}
