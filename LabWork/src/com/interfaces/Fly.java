package com.interfaces;
interface Flyable
{
	
  void fly_obj();
}
class Spacecraft implements Flyable
{

	@Override
	public void fly_obj() 
	{
		System.out.println(" Fly Spacecraft");
		
	}
	
}
class Airplane implements Flyable
{

	@Override
	public void fly_obj() 
	{
		System.out.println(" Fly Aeroplane");
		
	}
	
}
class Helicopter implements Flyable
{

	@Override
	public void fly_obj() 
	{
		System.out.println(" Fly Helicopter");
		
	}
	
}
public class Fly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spacecraft sp =new Spacecraft();
		sp.fly_obj();
		
		Airplane ap=new Airplane ();
		ap.fly_obj();
		
		Helicopter hp=new Helicopter();
		hp.fly_obj();
		
	}

}
