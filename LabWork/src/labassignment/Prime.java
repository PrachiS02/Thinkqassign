package labassignment;

import java.util.Scanner;

public class Prime 
{
	public static void checkprime(int num)
	{
		boolean status=true;
		
		if(num==0 || num==1)
			status=false;
		else
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
				status=false;
				break;
				}
			}
		}
		
		if(status) //status==true
		
			System.out.println(num+" is prime number ");
		
		else
			System.out.println(num+" is not prime number ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	       System.out.println("enter the number : ");
	       int n=sc.nextInt();
	       checkprime(n);
	}

}
