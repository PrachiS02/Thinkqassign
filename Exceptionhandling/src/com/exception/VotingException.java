package com.exception;

import java.util.Scanner;

public class VotingException {

	public static void main(String[] args) {
		
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter your age:");
      
      try
      {
    	  int age=sc.nextInt();
    	  if(age>18)
    		  System.out.println("vote");
    	  else
    		  System.out.println("cannot vote");
      }catch(Exception e)
      {
    	  System.out.println(e);
      }
      finally
      {
    	  sc.close();
    	  System.out.println("compulsory code");
      }
      
      System.out.println("vote ends");
	}

}
