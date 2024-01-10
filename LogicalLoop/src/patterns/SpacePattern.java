package patterns;

import java.util.Scanner;

public class SpacePattern 
{
   public static void space()
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter rows: ");
	   int rows=sc.nextInt();
	   
	   for(int i=1;i<=rows;i++)//rows
	   {
		   for(int sp=1;sp<=rows-1;sp++)//space
		   {
			   System.out.print(" ");
		   }
		   for(int j=1;j<=i;j++)//col
		   {
			   System.out.print("*");
		   }
		   System.out.println("");
	   }
	   
   }
	public static void main(String[] args) {
		
     space();
	}

}
