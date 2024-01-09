package com.oopslab;

class Engine
{
	private String etype;
	
	Engine()
	{
		
	}

	public Engine(String etype) {
		
		this.etype = etype;
	}
	
	public String getEtype() {
		return etype;
	}

	public void setEtype(String etype) {
		this.etype = etype;
	}


	public String toString() 
	{
		return "Engine [etype=" + etype + "]";
	}
	
	
}
public class Car1 
{
  private String carmodel;
  private int cprice;
  private Engine engine;
  
  Car1()
  {
	  
  }
  
	public Car1(String carmodel, int cprice, Engine engine) 
	{
		
	this.carmodel = carmodel;
	this.cprice = cprice;
	this.engine = engine;
   }
	



	public String getCarmodel() {
		return carmodel;
	}

	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}

	public int getCprice() {
		return cprice;
	}

	public void setCprice(int cprice) {
		this.cprice = cprice;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	

	public String toString() {
		return "Car1 [carmodel=" + carmodel + ", cprice=" + cprice + ", engine=" + engine + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Engine e1=new Engine("petrol");
        
        Car1 c1=new Car1("swift",80000,e1);
        
        System.out.println(c1);
	}

}
