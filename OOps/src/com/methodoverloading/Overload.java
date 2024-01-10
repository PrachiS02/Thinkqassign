package com.methodoverloading;
class Shape
{
	
 

	void calArea(int side)
    {
    	System.out.println("Area of square:"+side*side);
    }
    
    void calArea(float radius)
    {
    	System.out.println("Area of circle:"+(3.14*radius*radius));
    }
    
    
    void calArea(int length,int breadth)
    {
    	System.out.println("Area of rectangle:"+length*breadth);
    }
}


public class Overload {

	public static void main(String[] args)
	{
		Shape circle=new Shape();
		circle.calArea(5.0f);

	}

}
