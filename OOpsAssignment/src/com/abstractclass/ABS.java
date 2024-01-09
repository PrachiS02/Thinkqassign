package com.abstractclass;
//output one class extends single class so here we can not extends 2 classes simultaneously
abstract class Abs1
{
	public abstract void doAbs1();
}
abstract class Abs2
{
	public abstract void doAbs2();
}
class Temp extends Abs1
{

	@Override
	public void doAbs1() 
	{
		// TODO Auto-generated method stub
		
	}
	
}
//class Temp extends Abs2
//{
//	
//	}

public class ABS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
