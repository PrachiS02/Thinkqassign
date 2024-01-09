package com.interfaces;
interface playable
{
	public void  play();

}
class Football implements playable
{

	@Override
	public void play() 
	{
	  System.out.println("play the football");
		
	}
}
class Volleyball implements playable
{

	@Override
	public void play() 
	{
	  System.out.println("play the Volleyball");
		
	}
}
class Basketball implements playable
{

	@Override
	public void play() 
	{
	  System.out.println("play the Basketball");
		
	}
}
public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Football fb=new Football();
      fb.play();
      Volleyball vb=new Volleyball();
      vb.play();
      Basketball bb=new Basketball();
      bb.play();
	}

}
