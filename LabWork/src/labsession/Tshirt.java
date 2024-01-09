package labsession;

import java.util.Scanner;

public class Tshirt {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of T-shirt : ");
		int size=sc.nextInt();
		
		switch(size)
		{
		case 30:
		case 31:
		case 32:
		case 33:
		case 34:
			System.out.println("small");
			break;
		case 35:
		case 36:
		case 37:
		case 38:
		     System.out.println("medium");
			 break;
		case 39:
		case 40:
		     System.out.println("large");
			 break;	
		case 41:
		case 42:
		case 43:
		case 44:
		     System.out.println("extra large");
			 break;
		default:
			System.out.println("wrong size");
		}

	}

}
