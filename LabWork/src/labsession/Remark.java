package labsession;

import java.util.Scanner;

public class Remark {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the grade : ");
        char ch=sc.next().charAt(0);
        
        switch(ch)
        {
          case 'A':
        	  System.out.println("Excellent");
        	  break;
          case 'B':
        	  System.out.println("Good");
        	  break;
          case 'C':
        	  System.out.println("poor");
        	  break;  
          default :
        	  System.out.println("error");
        }
	}

}
