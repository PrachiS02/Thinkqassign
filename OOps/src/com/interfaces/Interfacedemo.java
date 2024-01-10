package com.interfaces;
interface Bakery
{
	String bname="Mybakery";//public,static,final
	void bake();//public abstract
}
class Cake implements Bakery
{

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("Cake:pineapple,chocolte");
	}
}
class Biscuit implements Bakery
{

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("Biscuit:almond,chocochips");
	}
	public void minOrder()
	{
		System.out.println("min order:250g");
	}
}
public class Interfacedemo 
{
  public static void main(String[] args) 
  {
	System.out.println("Bakery name:"+Bakery.bname);
	System.out.println("---------------------");
	
//	Cake c=new Cake();
//	c.bake();
//	
//	Biscuit b=new Biscuit();
//	b.bake();
	
	Bakery b;
	b=new Cake();
	b.bake();
	
	b=new Biscuit();
	b.bake();
	//b.minOrder();
	}
}
