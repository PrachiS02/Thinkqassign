package com.abstracts;
abstract class Bike
{
	private int id;
	private String name;
	private double cost;
	
	static String brandName;
	static double discount;
	
	static
	{
		brandName="honda";
	}

	public Bike() 
	{
		super();
	}

	public Bike(int id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public static String getBrandName() {
		return brandName;
	}

	public static void setBrandName(String brandName) {
		Bike.brandName = brandName;
	}

	public static double getDiscount() {
		return discount;
	}

	public static void setDiscount(double discount) {
		Bike.discount = discount;
	}
	static double giveDiscount(double dis)
	{
		discount=dis;
		return discount;
		
	}
	abstract void description();
	
	final void display()
	{
		System.out.println("Brand:"+brandName);
		System.out.println("Discount on all bikes:"+discount+"%");
		System.out.println("----------------------------------------");
		System.out.println("Id:"+id);
		System.out.println("Model:"+name);
		System.out.println("Cost:"+cost);
		System.out.println("Discounted cost:"+(cost-((discount/100)*cost)));
		
		
	}
	
}
class Sportbike extends Bike
{
	private int gears;
	private double maxspeed;
	
	public Sportbike()
	{
		super();
	}

    

	public Sportbike(int id, String name, double cost, int gears, double maxspeed)
	{
		super(id, name, cost);
		this.gears = gears;
		this.maxspeed = maxspeed;
	}
   
	


	public int getGears() {
		return gears;
	}



	public void setGears(int gears) {
		this.gears = gears;
	}



	public double getMaxspeed() {
		return maxspeed;
	}



	public void setMaxspeed(double maxspeed) {
		this.maxspeed = maxspeed;
	}



	@Override
	void description() 
	{
		System.out.println("This is SportBike....");
		System.out.println("Number of Gears:"+gears);
		System.out.println("Max Speed:"+maxspeed);
		
	}
	
}
class Normalbike extends Bike
{
    
    private float avg;
    
    
	public Normalbike()
	{
		super();
	}
    
    
	public Normalbike(int id, String name, double cost, float avg)
	{
		super(id, name, cost);
		this.avg = avg;
	}
    

	public float getAvg() {
		return avg;
	}


	public void setAvg(float avg) {
		this.avg = avg;
	}


	@Override
	void description() {
		// TODO Auto-generated method stub
		System.out.println("This is SportBike....");
		System.out.println("Number of Gears:2");
		System.out.println("Average:"+avg);
	}
	}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Sportbike sb=new Sportbike(1,"CVR10",87000,4,250.0);
      sb.setDiscount(20);
      sb.display();
      sb.description();
      
      //Normalbike nb=new Normalbike()
      
      
	}

}
