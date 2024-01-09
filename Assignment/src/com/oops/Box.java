package com.oops;

public class Box
{
    private int length;
    private int width;
    private int height;
    
    public Box(int length,int width,int height)
    {
    	int volume = length*width*height;
    	System.out.println("volume of box : "+volume);
    }
	public static void main(String[] args) 
	{
	   Box b1=new Box(10,10,10);
	   

	}

}
