package labsession;

import java.util.Scanner;

public class Divisible7 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number : ");
		int n=sc.nextInt();
		
		if(n%7==0)
		
			System.out.println(n+" is divisible by 7 ");
		else
		{
				
			System.out.println(n=(7-(n%7))+n);
		   
		    
		}
	}

}
