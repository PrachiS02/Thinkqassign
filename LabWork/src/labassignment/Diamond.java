package labassignment;

import java.util.Scanner;

public class Diamond
{
     public static void diamond()
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.print("Enter Number of Rows: ");
         int row = sc.nextInt();
         
        
         for (int i =1; i<= row; i++) 
         {
         
             for (int sp =1; sp<=row-i; sp++) 
                 System.out.print(" ");
                 
             for (int j = 1; j<= i*2-1; j++) 
                 if(i==1||j==1||j==2*i-1)
                     System.out.print("*");
                 else
                     System.out.print(" ");
             System.out.println();
         }
             
             
             
         for (int i =row-1; i>= 1; i--) 
         {
             for (int sp =1; sp<=row-i; sp++)
                 System.out.print(" ");
             for (int j = 1; j<= i*2-1; j++)
                 if(i==1||j==1||j==2*i-1)
                     System.out.print("*");
                 else
                     System.out.print(" ");
             System.out.println();
         }
     }
     
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		diamond();
	}

}
