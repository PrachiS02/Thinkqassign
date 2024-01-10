package com.methodoverloading;

class Room
{
	void calArea(int length)
	{
		System.out.println("area of room :"+length*length);
	}
	void calArea(int length,int breadth)
	{
		System.out.println("area of room :"+length*breadth);
	}
	
	void calVol(int length)
	{
		System.out.println("volume of room :"+length*length*length);
	}
	void calVol(int length,int breadth,int height)
	{
		System.out.println("volume of room :"+length*breadth*height);
	}
}
public class Overload2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Room r1=new Room();
       r1.calArea(5);
       
	}

}
