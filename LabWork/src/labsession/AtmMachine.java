package labsession;

import java.util.Scanner;

public class AtmMachine {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int bal=1000;
		int depo,withdraw;
		System.out.println("Available bal is :"+bal);
		System.out.println("1.deposit");
		System.out.println("2.withdraw");
		System.out.println("3.view balance");
		
		System.out.println("enter your choice : ");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			 System.out.println("enter money to deposit : ");
			 depo=sc.nextInt();
			 bal=bal+depo;
			 System.out.println("total bal is :"+bal);
			 break;
		case 2:
			 System.out.println("enter money to withdraw: ");
			 withdraw=sc.nextInt();
			 bal=bal-withdraw;
			 System.out.println("total bal is :"+bal);
			 break;
		case 3:
			System.out.println("view bal is :"+bal);
			break;
		default:
			System.out.println("wrong");
			 
		}
	}

}
