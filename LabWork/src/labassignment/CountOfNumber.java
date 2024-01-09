package labassignment;

import java.util.Scanner;

public class CountOfNumber 
{
	public static void countall()
	{
		Scanner sc=new Scanner(System.in);
		int pos=0;
		int neg=0;
		int zero=0;
	
		char ch;
		do
		{
			System.out.println("enter the number : ");
			int num=sc.nextInt();
			if(num>0)
				pos++;
			else if(num<0)
				neg++;
			else
				zero++;
			System.out.println("do you want enter more number : ");
			ch=sc.next().charAt(0);
			
		}while(ch=='y' || ch=='Y');
		
		System.out.println("positive count : "+pos++);
		System.out.println("negative count : "+neg++);
		System.out.println("zero count : "+zero++);
		
		
		
	}
	public static void main(String[] args)
	{
	  countall();
    }

}
