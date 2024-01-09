package labassignment;

import java.util.Scanner;

public class Checkprime 
{
	public static void prime(int num1,int num2)
	{
		
		
		for(int i=num1;i<num2;i++) 
		{
			boolean flag =true;
			for(int j=2;j<num2/2;j++) 
			{
				if(i%j==0) 
				{
					flag =false;
				}
				
				if(flag==false) 
				{
					System.out.println(i+" ,");
				}
			}
		
//		{
//			
//		}
			
		}
		
	}
   
	public static void main(String[] args)
 {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      
      System.out.println("enter first number:");
      int a =sc.nextInt();
      
      System.out.println("enter second Number:");
      int b =sc.nextInt();
      
      prime(a,b);
	}

}
