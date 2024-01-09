package com.abstractinterface;
abstract class Equipment
{
	void fill()
	{
		System.out.println("Fill...");
	}
	public abstract void mix();
}
class Cement_mixer extends Equipment
{

	@Override
	public void mix() 
	{
		System.out.println("Mix....");
		
	}
	void pour()
	{
		System.out.println("Pour...");
	}
}

public class Absequip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Cement_mixer cm=new Cement_mixer();
     cm.fill();
     cm.mix();
     cm.pour();
     
      Equipment e=new Cement_mixer();
      e.fill();
      e.mix();

      
      
      
      

	}

}
