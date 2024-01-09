package com.inheritance;
class Cake
{
	void bake()
	{
		System.out.println("cake was baked");
	}
}
class Strawberry extends Cake
{
	void bake()
	{
		super.bake();
		System.out.println("this is strawberry cake");
	}
}
class BlackForest extends Cake
{
	void bake()
	{
		System.out.println("this is BlackForest cake");
	}
}
public class Cakebake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strawberry sb=new Strawberry();
	       sb.bake();
       BlackForest bf=new BlackForest();
       bf.bake();
       
       
	}

}
