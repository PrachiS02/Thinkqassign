package com.abstractclass;
abstract class Machine
{
	void rotate()
	{
		System.out.println("machine is rotating");
	}
	public abstract void crush();
	
}
class Juice extends Machine
{
    void filter()
    {
    	System.out.println("filter the juice");
    }
	@Override
	public void crush()
	{
		System.out.println("Crush the juice");
		
	}
	


}
abstract class Mixer extends Machine
{
	void blend()
	{
		System.out.println("Blending...");
	}
	@Override
	public void crush()
	{
		System.out.println("Crush the juice");
		
	}
	

}
public class Machineclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Juice j=new Juice();
    j.crush();
    j.rotate();
    j.filter();
    System.out.println(j);
    
  Machine m;
  m=new Juice();
   m.crush();
  m.rotate();
    
  //Mixer x;
 
  
  
   
    
	}

}
