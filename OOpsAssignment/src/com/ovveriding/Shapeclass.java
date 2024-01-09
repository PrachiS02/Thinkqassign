package com.ovveriding;

class Shape
{
	void draw()
	{
		System.out.println("draw shape");
	}

}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("draw circle");
	}

}
class Square extends Shape
{
	void draw()
	{
		System.out.println("draw Square");
	}

}
class Rectangle extends Shape
{
	void draw()
	{
		super.draw();
		System.out.println("draw Rectangle");
	}

}
public class Shapeclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape sh=new Shape();
		sh.draw();
		Rectangle r =new Rectangle();
		r.draw();
	}

}
