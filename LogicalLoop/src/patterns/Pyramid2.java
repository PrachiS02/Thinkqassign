package patterns;

import java.util.Scanner;

public class Pyramid2
{
	public static void pyramidpattern2()
	{
		Scanner sc=new Scanner(System.in);
		   System.out.println("enter rows: ");
		   int rows=sc.nextInt();
		   
		   for(int i=1;i<=rows;i++)
		   {
			   
			   for(int j=1;j<=rows-i;j++)
			   {
				   System.out.print(" ");
			   }
			   for(int k=1;k<=2*i-1;k++)
			   {
				   System.out.print("*");
			   }
			   System.out.println("");
		   }
		   
		   for(int i=rows-1;i>=1;i--)
		   {
			   
			   for(int j=rows-1;j>=i;j--)
			   {
				   System.out.print(" ");
			   }
			   for(int k=1;k<=2*i-1;k++)
			   {
				   System.out.print("*");
			   }
			   System.out.println("");
		   }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pyramidpattern2();
	}

}
