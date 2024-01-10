package com.stringassignmnet1;

public class Removelastoccuchar 
{
    public static void removelastoccurchar(String s,char c)
    {
    	char ch[] = s.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--)
		{
			if (ch[i] == c) 
			{
				ch[i] = ' ';
				break;
			}
		}
		System.out.println(ch);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java";
		char ch= 'a';
		removelastoccurchar(str, ch);
	}

	}


