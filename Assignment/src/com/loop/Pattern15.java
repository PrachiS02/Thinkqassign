package com.loop;

public class Pattern15
{
	public static void letter()
	{
	int letter = 65; 
	for (int i = 0; i<= 9; i++)  
	{  
	 
	for (int j = 0; j <= i; j++)  
	{  
	System.out.print((char) letter + " ");  
	}  
	letter++;  
	System.out.println();  
	} 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		letter();
	}

}
