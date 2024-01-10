package com.inheritance;


class Vehicle
{
	private int id;
	private int modelno;
	private double price;
	
	Vehicle()
	{
		super();
	}

	public Vehicle(int id, int modelno, double price) {
		super();
		this.id = id;
		this.modelno = modelno;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getModelno() {
		return modelno;
	}

	public void setModelno(int modelno) {
		this.modelno = modelno;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", modelno=" + modelno + ", price=" + price + "]";
	}
	
}
class Car extends Vehicle
{
	private String brand;
	private String fueltype;
	private int noofgears;
	
	public Car() 
	{
		super();
	}

	public Car(int id, int modelno, double price, String brand, String fueltype, int noofgears) {
		super(id, modelno, price);
		this.brand = brand;
		this.fueltype = fueltype;
		this.noofgears = noofgears;
	}

	public String getBrand() {
		return brand;
		
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getFueltype() {
		return fueltype;
	}

	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}

	public int getNoofgears() {
		return noofgears;
	}

	public void setNoofgears(int noofgears) {
		this.noofgears = noofgears;
	}

	@Override
	public String toString() {
		return super.toString()+"Car [brand=" + brand + ", fueltype=" + fueltype + ", noofgears=" + noofgears + "]";
	}
	
	
}

class Racingcar extends Car
{
	private float maxspeed;
	private double milage;
	
	Racingcar()
	{
		super();
	}

	public Racingcar(int id, int modelno, double price, String brand, String fueltype, int noofgears, float maxspeed,
			double milage) {
		super(id, modelno, price, brand, fueltype, noofgears);
		this.maxspeed = maxspeed;
		this.milage = milage;
	}

	public float getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(float maxspeed) {
		this.maxspeed = maxspeed;
	}

	public double getMilage() {
		return milage;
	}

	public void setMilage(double milage) {
		this.milage = milage;
	}

	@Override
	public String toString() {
		return super.toString()+"Racingcar [maxspeed=" + maxspeed + ", milage=" + milage + "]";
	}
	
}
  public class Multilevel 
{
	public static void main(String[] args) 
	{
		Car c1=new Car(1,2001,35000,"swift","petrol",5);
		c1.setPrice(4000000);
		System.out.println(c1);
		
		//(int id, int modelno, double price, String brand, String fueltype, int noofgears, float maxspeed,
				//double milage)
		Racingcar r1=new Racingcar(1,2001,100.00,"baleno","petrol",5,300f,30.0);
		System.out.println(r1);
		
		
		
//		r1.setId(2);
//		r1.setBrand("baleno");
//		r1.setMaxspeed(300);
//		r1.setMilage(30);
//		
		//System.out.println(r1);
		
	}

}
