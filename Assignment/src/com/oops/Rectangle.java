package com.oops;

public class Rectangle 
{
	private int length;
    private int width;
    
    public Rectangle(int length,int width)
    {
    	int area = length*width;
    	System.out.println("area of revtangle  : "+area);
    }
	public static void main(String[] args)
	{
	  Rectangle r1=new Rectangle(10,20);

	}

}
