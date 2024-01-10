package com.stringassignmnet1;

public class Lastoccurenceofword
{
	public static void findLastOccurance(String s,String word)
	{
		String starr[]=s.split(" ");
		int loc=0;
		for (int i = 0; i < starr.length-1; i++) 
		{   
			if(starr[i].equalsIgnoreCase(word))
				loc=i;
		}
		
		System.out.println(word+" last occurance is at "+loc);
	}
	
		public static void main(String[] args) {
			
			String str="jingle bells jingle bells jingle on the way";
			findLastOccurance(str, "bells");
		}

	}


