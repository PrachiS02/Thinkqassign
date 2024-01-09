package labassignment;

import java.util.Scanner;

public class Random 
{
    public static void random() 
    {
    	Scanner sc=new Scanner(System.in);
    	int rndnum=(int)Math.random();
    	int num;
    	char ch;
    	
    	do
    	{
    		System.out.println("enter the number : ");
    		num=sc.nextInt();
    		
    		if(num==rndnum)
    		{
    			System.out.println("guess correct number : "+rndnum);
    		
    		}
    		else if(num>rndnum)
    		{
    			System.out.println("to high try again");
    		}
    		else
    		{
    			System.out.println("to low try again");
    		}
    		ch='y';
    	}while(ch=='y');
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		random() ;
	}

}
