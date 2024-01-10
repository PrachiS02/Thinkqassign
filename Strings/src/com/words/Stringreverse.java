package com.words;

public class Stringreverse 
{
     static void reversestring(String st)
     {
    	 String rev="";
    	 for(int i=st.length()-1;i>=0;i--)
    	 {
    		 rev=rev+st.charAt(i);
    	 }
    	 System.out.println(rev);
     }
     
     static void reverse1(String st)
     {
    	 char ch[]=st.toCharArray();
    	 
    	 for(int i=0,j=ch.length-1;i<ch.length/2;i++,j--)
    	 {
    		 char temp=ch[i];
    		 ch[i]=ch[j];
    		 ch[j]=temp;
    	 }
    	 System.out.println(ch);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s=" I love India";
         reversestring(s);
         reverse1(s);
	}

}
