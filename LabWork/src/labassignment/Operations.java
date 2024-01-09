package labassignment;

import java.util.Scanner;

public class Operations 
{
     public static void operadd()
     {
    	 Scanner sc=new Scanner(System.in);
    	 int check=0;
    	 int num1;
    	 int num2;
    	 char ch;
    	 do
    	 {
    		System.out.println("enter num1 : ");
    		num1=sc.nextInt();
    		System.out.println("enter num2 : ");
    		num2=sc.nextInt();
    		
    		int sum=num1+num2;
    		
    		
    		System.out.println("sum is : "+sum);
    	
    		System.out.println("do you want enter more number : ");
    		ch=sc.next().charAt(0);
    	 }while(ch=='Y'||ch=='y');
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         operadd();
	}

}
