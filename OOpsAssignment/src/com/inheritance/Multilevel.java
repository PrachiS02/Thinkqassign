package com.inheritance;

class Bike {
	public Bike()
	{
		System.out.println("Segment: 1000cc");
	}

	public void BikeType() 
	{
		System.out.println("Bike Type: Sports");
	}
}

class NinJa extends Bike {
	public NinJa() 
	{
		System.out.println("Make NinJa");
	}

	public void brand()
	{
		System.out.println("Manufacturer: Kawasaki");
	}

	public void speed() 
	{
		System.out.println("Max Speed: 290Kmph");
	}
}

class NinJa1000R extends NinJa {
	public NinJa1000R()
	{
		System.out.println("NinJa Model: 1000R");
	}

	public void speed() 
	{
		System.out.println("Max Speed: 280Kmph");
	}

	
}
public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NinJa1000R obj = new NinJa1000R();
		obj.BikeType();
		obj.brand();
		obj.speed();
	}

}
