package com.stringarrayexception;

public class Stringarray 
{
    public static void array(String s[])
    {
    	String newstr="";
    	int index=0;
    	
    	for(int i=0;i<s.length;i++)
    	{
    		newstr=newstr+s[i].charAt(index);
    		index++;
    		
    	}
    	System.out.println(newstr);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s[]= {"winter","fall","summer","spring"};
       array(s);
	}

}
