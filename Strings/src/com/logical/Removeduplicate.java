package com.logical;

public class Removeduplicate {

	public static String removedup(String st)
	{
		String str="";
		boolean found;
		for(int i=0;i<st.length();i++)
		{
			found=false;
			for(int j=0;j<str.length();j++)
			{
				if(st.charAt(i)==st.charAt(j))
				{
					found =true;
					break;
				}
			}
			if(found==false)
			{
				str=str+st.charAt(i);
			}
		}
		return str;
		
	}
	public static void main(String[] args) {
	
     String st="Book";
     System.out.println("original:"+st);
     System.out.println("New:"+removedup(st));
	}

}
