//8. WAJP2 add elements to a string array 
//9. WAJP2 print elements of array
package com.Arrayassignment1;

public class Stringarray
{
    public static void printelements(String name[])
    {
    	for(String s:name)
    	{
    		System.out.println(s+" ");
    	}
    }

    public static void main(String[] args)
    {
	
        String[] name= new String[2];
        name[0]= "prachi";
        name[1]= "sakshi";
        printelements(name);
	}

}
