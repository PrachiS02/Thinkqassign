package patterns;

import java.util.Scanner;

public class SpacePattern2 {

	public static void triangle()
	   {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("enter rows: ");
		   int rows=sc.nextInt();
		   
		   for(int i=1;i<=rows;i++)
		   {
			   
			   for(int j=rows-i;j>=1;j--)
			   {
				   System.out.print(" ");
			   }
			   for(int k=1;k<=i;k++)
			   {
				   System.out.print("*");
			   }
			   System.out.println("");
		   }
		   
	   }
		public static void main(String[] args) {
			
	     triangle();
		}


	}


