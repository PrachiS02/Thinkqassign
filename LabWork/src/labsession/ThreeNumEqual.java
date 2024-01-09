package labsession;

import java.util.Scanner;

public class ThreeNumEqual {

	public static void main(String[] args) 
	{
		
     Scanner sc=new Scanner(System.in);
     
     System.out.println("enter num1 : ");
     int num1=sc.nextInt();
     System.out.println("enter num2 : ");
     int num2=sc.nextInt();
     System.out.println("enter num3 : ");
     int num3=sc.nextInt();
     
     if(num1==num2 && num1==num3 && num2==num3)
     {
    	 System.out.println("three numbers are equal");
     }
     if((num1==num2) ||( num1==num3) || (num3==num2))
     {
    	 System.out.println("two numbers are equal");
     }
     else
    	 System.out.println("three numbers are not equal"); 
	}

}
