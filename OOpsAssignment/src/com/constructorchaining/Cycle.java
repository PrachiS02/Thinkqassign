package com.constructorchaining;

public class Cycle 
{
  int acno;
  int noofwheels;
  
  Cycle()
  {
	  System.out.println("I am default constructor");
  }
  Cycle(int accno,int noofwheels)
  {
	  this();
	  System.out.println("I am another Constructor");
  }
  @Override
  public String toString()
	{
	return "Cycle [acno=" + acno + ", noofwheels=" + noofwheels + "]";
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Cycle c1=new Cycle();
       System.out.println(c1);
       System.out.println("--------------------");
       Cycle c2=new Cycle(123,2);
       System.out.println(c2);
	}

}
