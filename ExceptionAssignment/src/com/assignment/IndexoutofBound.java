package com.assignment;

public class IndexoutofBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
            int[] arr = new int[3];
          
            int value = arr[5];
            System.out.println("Value: " + value); 
        } 
		catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: ");
        }

       
        try
        {
            String str = "example";
           
            char character = str.charAt(10);
            System.out.println("Character: " + character); 
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("Caught StringIndexOutOfBoundsException: ");
        }

        System.out.println("Program continues after handling exceptions.");
    }
}
