package com.ovveriding;
class Vehicle
{
	public String accelerate(long mph)
	{
		return "vehicle accelerate at: "+mph+"MPH.";
		
	}
	String stop() 
	{
	
		return "vehicle has stopped";
		
	}
	String run() 
	{
		return "vehicle is running";
	}
   

}

class car extends Vehicle
{
	public String accelerate(long mph)
	{
		
		return "vehicle accelerate at: "+mph+"MPH.";	
	}

}
public class VehicleCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Vehicle v=new Vehicle();
        System.out.println(v.accelerate(25));
        System.out.println(v.run());
        System.out.println(v.stop());
        
        car c=new car();
        System.out.println(c.accelerate(20));
        System.out.println(v.run());
	}

}
