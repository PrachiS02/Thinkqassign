package com.interfaces;
interface drawable
{
	public void draw();
	
}
class Circle implements drawable
{

	@Override
	public void draw() 
	{
		
		System.out.println("draw the circle");
		
	}
	
}
class Rectangle  implements drawable
{

	@Override
	public void draw() 
	{
		// TODO Auto-generated method stub
		System.out.println("draw the Rectangle");
		
	}
	
}
class Triangle implements drawable
{

	@Override
	public void draw() 
	{
		
		System.out.println("draw the Triangle");
		
	}
	
}
public class Draw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circle c= new Circle();
        c.draw();
        Rectangle r=new Rectangle();
        r.draw();
        Triangle tr=new Triangle();
        tr.draw();
	}

}
