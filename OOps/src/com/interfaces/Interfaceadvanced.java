package com.interfaces;
interface Calculate
{
	void area();
	//java -8
	//mutable and backward compatibility
	default void volume()
	{
		System.out.println("In volume method");
		display();
		show();
	}
	//common implementation for all classes
	//belong to interface
	static void info()
	{
		System.out.println("Geometry");
		show();
	}
	//java-9
	//confidential info: sensetive info belongs to agreement
	//instance
	private void display()
	{
		System.out.println("made by:prachi");
	}
	private static void show()
	{
		System.out.println("Pan no:123GHJ");
	}
}
class Square implements Calculate
{
	int side;
	Square()
	{
		side=4;
	}
     
	public Square(int side)
	{
		
		this.side = side;
	}

	@Override
	public void area() 
	{
		// TODO Auto-generated method stub
		System.out.println("area of square is:"+(side*side));
	}
	
}
class Cube implements Calculate
{
	int side;
     Cube()
     {
    	side=20; 
     }
     
     public Cube(int side)
     {
    	 this.side=side;
     }
	@Override
	public void area() 
	{
		// TODO Auto-generated method stub
		System.out.println("area of cube:"+(6*side*side));
	}
	public void volume()
	{
		Calculate.super.volume();
	  System.out.println("Volume of cube :"+(side*side*side));	
	}
	
}
public class Interfaceadvanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate.info();
		
		   Calculate  c;
		  c= new Square(23);
		  c.area();
		  c.volume();
		  
		  System.out.println("-----------------------------");
		  c= new Cube(50);
		  c.area();
		  c.volume();
	}

}
