package labassignment;

import java.util.Scanner;

public class Rose
{
   public static void roses(int n)
   {
	   
	  int perrose=3;
	  int perdozen=100;
	  int buycost=n*3;
	  int rose = buycost/perdozen;
	  
	  System.out.println("Roses required to sell to recover buying cost of roses in dozen = "+rose);
	   
	  
	  
	
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter bought roses:");
        int n=sc.nextInt();
        roses(n);
        
	}

}
