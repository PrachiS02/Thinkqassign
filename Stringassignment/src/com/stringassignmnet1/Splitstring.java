package com.stringassignmnet1;

public class Splitstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s1="HELLO$WORLD";
         s1=s1+" ";
//         String sp[]=s1.split("\\$");
//         
//         for(String val:sp)
//         {
//        	 System.out.println(val);
//         }
//        
          char ch1='$',ch2;
          String s2="";
          for(int i=0;i<s1.length();i++)
          {
        	  ch2=s1.charAt(i);
        	  if(ch1==ch2 ||i==s1.length()-1)
        	  {
        		  System.out.println(s2);
        		  s2="";
        	  }
        	  else
        	  {
        		  s2+=ch2;
        	  }
          }
	}

}
