package labsession;

import java.util.Scanner;

public class CommercialApp1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("select you category : ");
		System.out.println(" 1.Men :");
		System.out.println(" 2.Women :");
		System.out.println(" 3.Kids:");
		
		System.out.println("enter your category : ");
		int cat=sc.nextInt();
		
		switch(cat)
		{
		case 1:
			 System.out.println("enter your option : ");
			 System.out.println(" 1.footwear :");
			 System.out.println(" 2.T-shirt :");
			 int opt=sc.nextInt();
			 switch(opt)
			 {
			   case 1:
				  System.out.println("your category is men");
				  System.out.println("your option is footwear");
				  break;
			    case 2:
				  System.out.println("your category is men");
				  System.out.println("your option is T-shirt");
				  break;
			 }
			 break;
			 
		 case 2:
			   System.out.println("enter your option : ");
			 System.out.println(" 1.jewellery :");
			 System.out.println(" 2.saree :");
			 int opt1=sc.nextInt();
			 switch(opt1)
			 {
			   case 1:
				  System.out.println("your category is women");
				  System.out.println("your option is jewellery");
				  break;
			    case 2:
				  System.out.println("your category is women");
				  System.out.println("your option is saree");
				  break;
			 }
			 break;
		case 3:
			System.out.println("enter your option : ");
			 System.out.println(" 1.Toys :");
			 System.out.println(" 2.Educatinal game :");
			 int cat2=sc.nextInt();
			 switch(cat2)
			 {
			   case 1:
				  System.out.println("your category is kids");
				  System.out.println("your option is toys");
				  break;
			    case 2:
				  System.out.println("your category is kids");
				  System.out.println("your option is educational game");
				  break;
			 }
			 break;
			 
			 default:
				 System.out.println("error");
		
		}
		
			
		

	}

}
