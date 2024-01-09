package com.oopslab;

public class Car
{
    private int cId;
    private String cname;
    private String color;
    private int speed;
    private double price;
    
    public void setcId(int cId)
    {
    	this.cId=cId;
    }
    public int getcId()
    {
    	return cId;
    }
    public void setcname(String cname)
    {
    	this.cname=cname;
    }
    public String getcname()
    {
    	return cname;
    }
    public void setcolor(String color)
    {
    	this.color=color;
    }
    public String getcolor()
    {
    	return color;
    }
    public void setspeed(int speed)
    {
    	this.speed=speed;
    }
    public int getspeed()
    {
    	return speed;
    }
    public void setprice(double price)
    {
    	this.price=price;
    }
    public double getprice()
    {
    	return price;
    }
    
   /* public void setdetails(int Id,String name,String ccolor,int cspeed,double cprice)
    {
       cId=Id;
       cname=name;
       color=ccolor;
       speed=cspeed;
       price=cprice;
    }*/
    
   /* public void setdetails(int cId,String cname,String color,int speed,double price)
    {
       this.cId=cId;
       this.cname=cname;
       this.color=color;
       this.speed=speed;
       this.price=price;
    }*/
   
   
   
   public void show()
   {
	   System.out.println("carId     : "+cId);
	   System.out.println("car name  : "+cname);
	   System.out.println("car color : "+color);
	   System.out.println("speed     : "+speed);
	   System.out.println("car price : "+price);
   }
   
   
}
