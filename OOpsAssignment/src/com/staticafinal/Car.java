package com.staticafinal;

public class Car
{
    static String model;
    static int totalcarsold;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Car.model="baleno");
		System.out.println(Car.totalcarsold=2);
		System.out.println("---------------------------");
		Car c1=new Car();
		Car c2=new Car();
		c1.model="Ertiga";
		System.out.println(c2.model);
        //System.out.println(car.model: " baleno");
	}

}
