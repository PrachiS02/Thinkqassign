package patterns;

import java.util.Scanner;

public class Arrow 
{
    public static void arrowpattern()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the rows: ");
    	int rows=sc.nextInt();
    	for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
    	for(int i=rows-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
    }
	public static void main(String[] args) {
		
		arrowpattern();
	}

}
