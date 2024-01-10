package com.logical;

public class Stringarraycomparison {

	
	static void  uniquestring(String s1[],String s2[])
	{
		for(String st:s2)
		{
		   boolean found=false;
		  for(String s:s1)
		  {
		  	 if(st.equals(s))
		  	 {
		  		 found=true;
		  		 break;
		  	 }
		  }
		  if(!found)
		  {
			  System.out.println(st);
		  }
		}  
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1[]= {"Jyoti","Reetu","Prachi","Pranay"};
       String s2[]= {"Nisha","Reetu","Prachi","Pooja","Vikas"};
       uniquestring(s1, s2);
	}

}
