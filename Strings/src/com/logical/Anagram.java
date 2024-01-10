package com.logical;

public class Anagram {
    public static void sortarray(char ch[])
    {
    	for(int i=0;i<ch.length;i++)
    	{
    		for(int j=i+1;j<ch.length;j++)
    		{
    			if(ch[i]>ch[j])
    			{
    				char temp=ch[i];
    				ch[i]=ch[j];
    				ch[j]=temp;
    			}
    		}
    	}
    }
	public static boolean checkanagram(String s1,String s2)
	{
		boolean status=true;
		s1=s2.toLowerCase();
		s2=s1.toLowerCase();
		
		if(s1.length()!=s2.length())
		{
			return false;
		}
		else
		{
			char ch1[]=s1.toCharArray();
			char ch2[]=s2.toCharArray();
			
			sortarray(ch1);
			sortarray(ch2);
			
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i]!=ch2[i])
				   return false;
			}
		}
		return true;		
		
	}
	public static void main(String[] args) {
	
        String  s1="Race";
        String s2="Care";
        
        if(checkanagram(s1,s2))
        {
        	System.out.println(s1+" "+s2+":is anagram");
        }
        else
        {
        	System.out.println(s1+" "+s2+":is not  anagram");
        }
	}

}
