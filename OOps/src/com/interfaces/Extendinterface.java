package com.interfaces;

interface Movable {
	public void move();
}

interface Displayable extends Movable {
	void printMe(String msg);
}

class Car implements Displayable {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("car is moving at speed of 50km/hr");
	}

	@Override
	public void printMe(String msg) {
		// TODO Auto-generated method stub
		System.out.println("mycar:" + msg);
	}

}

class Bike implements Movable {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("bike is moving at speed 60km/hr");
	}
}

public class Extendinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Displayable d;
		d = new Car();
		d.move();
		d.printMe("BMW500series");

		System.out.println("--------------------------------");

		Movable m;

		m = new Car();
		m.move();

		m = new Bike();
		m.move();

	}

}
