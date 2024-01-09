package com.oopslab;

public class Square 
{
    void Square(int n)
    {
    	System.out.println("Square: "+(n*n));
    }
    void Square(float n)
    {
    	System.out.println("Square: "+(n*n));
    }
    void Square(double n)
    {
    	System.out.println("Square: "+(n*n));
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
    Square s1=new Square();
    s1.Square(5);
    s1.Square(5.0f);
    s1.Square(5d);
	}

}
