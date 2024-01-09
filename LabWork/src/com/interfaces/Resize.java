package com.interfaces;
interface Resizable
{
	void resizeWidth(int width);
	void resizeHeight(int height);
	
}
class Rectangle1 implements Resizable
{

	@Override
	public void resizeWidth(int width)
	{
	     System.out.println("width:"+width);
		
	}

	@Override
	public void resizeHeight(int height)
	{
	
		System.out.println("height:"+height);
	}
	
}

public class Resize {

	public static void main(String[] args)
	{

		Rectangle1 r=new Rectangle1();
		r.resizeWidth(5);
		r.resizeHeight(10);
		//System.out.println(r);

	}

}
