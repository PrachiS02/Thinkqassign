package com.words;

public class Frequencyword 
{
      static void findfreq(String st)
      {
    	  String str[]=st.split("\\s");
    	  int count;
    	  for(int i=0;i<str.length;i++)
    	  {
    		  count=1;
    		  if(str[i].equals("visited"))
    			  continue;
    		  for(int j=i+1;j<str.length;j++)
    		  {
    			  if(str[i].equalsIgnoreCase(str[j]))
    			  {
    				  count++;
    				  str[j]="visited";
    			  }
    		  }
    		  System.out.println(str[i]+" "+count);
    	  }
      }
	public static void main(String[] args) {
		
         String st=" This is new bag in the bag is notebbok";
         System.out.println(st);
         findfreq(st);
	}

}
