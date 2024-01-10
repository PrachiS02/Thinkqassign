package com.assignment2;

public class Countduplicate 
{
     public static void countduplicate(String st)
     {
    	
         int count;  
             
         char s[] = st.toCharArray();  
           
         System.out.println("Duplicate characters in a given string: ");  
          
         for(int i = 0; i <s.length; i++) 
         {  
             count = 1;  
             for(int j = i+1; j <s.length; j++)
             {  
                 if(s[i] == s[j])
                 {  
                     count++;  
                      
                     s[j] = '0';  
                 }  
             }  
            
             if(count > 1) 
             {
                 System.out.println(s[i]+"-->"+count);  
             }
         }
         }  
     
	public static void main(String[] args) 
	{
		String s="aabbcdd";
		countduplicate(s);
		
	}
}
		

