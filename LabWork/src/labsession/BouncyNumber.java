package labsession;

import java.util.Scanner;

public class BouncyNumber 
{
    public static boolean  increaseNum(int num)
    {
    	int rem;
    	int temp=num;
    	
    	while(num!=0)
    	{
    		rem=num%10;
    		if(temp>rem)
    		{
    			num=num/10;
    			temp=rem;
    		}
    		else
    		{
    			break;
    		}
    	}
    	if(num==0)
    	{
    		return true;
    	}
		return false;
    }
    
    	public static boolean decreaseNum(int num)
    	{
    	int rem;
    	int temp=0;
    	
    	while(num!=0)
    	{
    		rem=num%10;
    		if(temp<rem)
    		{
    			num=num/10;
    			temp=rem;
    		}
    		else
    		{
    			break;
    		}
    	}
    	if(num==0)
    	{
    		return true;
    	}
		return false;
    }
    

    public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number : ");
      int n=sc.nextInt();
      
      if( increaseNum(n))
    	  System.out.println(n+" is increasing number ");
      else if(decreaseNum(n))
    	  System.out.println(n+ " is decreasing number");
      else
    	  System.out.println(n+" is bouncy number");
    	  
	}

}
