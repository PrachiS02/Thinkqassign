package com.ovveriding;

class Bike
{
	String color="black";
	int speed=50;
	
	void bikeinfo()
	{
		System.out.println("color:"+color);
		System.out.println("speed:"+speed);
	}

}
class KTM extends Bike
{
	void bikeinfo()
	{
		super.bikeinfo();
		System.out.println("this is KTM bike");
	}
}
public class Bikeclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //Bike b=new Bike();
      //b.bikeinfo();
       
		
		KTM p=new KTM();
	  p.bikeinfo();
	}

}
