package com.methodoverloading;
class MyRoom
{
	int length;
	int breadth;
	int height;
	
	MyRoom()
	{
		length=breadth=height=0;
	}
	MyRoom(int length)
	{
		this.length=length;
		this.breadth=length;
		this.height=length;
	}
	MyRoom(int length,int breadth,int height)
	{
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	void calArea()
	{
		System.out.println("area of room is: "+length*breadth);
	}
	void calVol()
	{
		System.out.println("volume:"+(length*breadth*height));
	}


}
public class Hotel2 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         MyRoom r1=new MyRoom(10);
         r1.calArea();
         r1.calVol();
	}

}
