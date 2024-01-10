package com.words;

public class Mostrepaetword 
{
	static void mostrepeatword(String st)
    {
  	  String str[]=st.split("\\s");
  	  int count;
  	  int maxlength = 0;
  	  String mwords="";
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
  		  if(count>maxlength)
  		  {
  			  maxlength=count;
  			  mwords=str[i];
  		  }
  		 
  	  }
  	 System.out.println("Most repeated word:"+mwords);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="jingle bells jingle bells jingle all the day ";
        System.out.println(st);
        mostrepeatword(st);
	}

}
