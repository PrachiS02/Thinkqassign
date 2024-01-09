package labsession;

import java.util.Scanner;

public class TwinPrime 
{
    public static boolean prime(int num)
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
		
		return status;

	}
    
	  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the first number : ");
      int n1=sc.nextInt();
      System.out.println("enter the second number : ");
      int n2=sc.nextInt();
      
      if(prime(n1)&&prime(n2)&&(n2-n1==2))
      {
    	  System.out.println(n1+ " and "+n2+" are twin prime numbers ");
      }
      else 
      {
		System.out.println("not twin prime");
	  }
    
	}
}
