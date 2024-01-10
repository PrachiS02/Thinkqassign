package com.innerdemo;

interface Doable {
	public void doit();

}

class Car {
	public void drive() {
		System.out.println("I am driving car");
	}

}

abstract class Cake {
	abstract void dobaking();

}

public class Annoymousclass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// using interface

		Doable d1 = new Doable() {

			@Override
			public void doit() {
				// TODO Auto-generated method stub
				System.out.println("I am attending class");
			}

		};
		d1.doit();

		Car c1 = new Car() {
			public void drive() {
				System.out.println("I am driving a car");
			}

		};
		c1.drive();

		Cake c = new Cake() {

			@Override
			void dobaking() {
				// TODO Auto-generated method stub
				System.out.println("I am baking the chocolate cake");
			}

		};
		c.dobaking();

	}

}
