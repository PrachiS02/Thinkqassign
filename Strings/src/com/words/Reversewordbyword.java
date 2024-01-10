package com.words;

public class Reversewordbyword {

	static void reverseword(String st)
	{
		String str[]=st.split("\\s");
		String rev="";
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=str[i].length()-1;j>=0;j--)
			{
				rev=rev+str[i].charAt(j);
			}
			rev=rev+" ";
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" I love India";
		reverseword(s);
	}

}
