package com.logical;

public class Encodestring 
{
    public static void replacevowels(String st)
    {
    	char c[]=st.toCharArray();
    	for(int i=0;i<c.length;i++)
    	{
    		if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U')
    		{
    		  c[i]='#';
    		}
    	}
    	System.out.println(c);
    }
	public static void main(String[] args) 
	{
       String st ="Education";
       System.out.println(st);
       replacevowels(st);
       System.out.println(st);
	}

}
