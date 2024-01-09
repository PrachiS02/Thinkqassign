package com.abstract1;
abstract class Shape
{
	Shape()
	{
		
	}
	abstract void calculatearea();
	abstract void calCir();
}
class Circle extends Shape
{
     int r=5;
	@Override
	void calculatearea() 
	{
	
     System.out.println("area of circle:"+(3.14*r*r));
		
	}

	@Override
	void calCir()
	{
		System.out.println("circumferance of circle:"+(2*3.14*r));
		
	}
	
}
 class Rectangle extends Shape
{
     int length=8;
     int breadth=5;
     
	@Override
	void calculatearea() 
	{
		System.out.println("area of rectangle:"+(length*breadth));
	}

	@Override
	void calCir() {
		// TODO Auto-generated method stub
		
	}
	
}
 class Square extends Shape
 {
    int side=4;
	@Override
	void calculatearea() 
	{
		
		System.out.println("area of square:"+(side*4));
	}

	@Override
	void calCir() {
		// TODO Auto-generated method stub
		
	}
	 
 }
public class Shapesall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Circle c=new Circle();
       c.calCir();
       c.calculatearea();
       
       Rectangle r=new Rectangle();
       r.calculatearea();
       
       Square sq=new Square();
       sq.calculatearea();
       
	}

}
