package com.interfaces;

interface Payment {
	void pay(float amount);
}

class Student implements Payment {
	int id;
	String name;
	double qfees;

	Student() {

	}

	Student(int id, String name, double qfees) {
		this.id = id;
		this.name = name;
		this.qfees = qfees;
	}

	@Override
	public void pay(float amount) {
		// TODO Auto-generated method stub
		System.out.println("Id: " + id + " Name:" + name);
		System.out.println("total fees" + qfees);
		System.out.println("fees paid:" + amount);
		if ((qfees - amount) != 0)
			System.out.println("Remaining fees to be paid:" + (qfees - amount));

	}
}

class Celebrity implements Payment {
	String adharcard;
	String celname;
	double income;

	public Celebrity() {

	}

	public Celebrity(String adharcard, String celname) {
		super();
		this.adharcard = adharcard;
		this.celname = celname;
	}

	@Override
	public void pay(float amount) {
		// TODO Auto-generated method stub
		double taxamt;
		System.out.println("-------------------------------------");
		System.out.println("welcome to tax payment:" + celname);
		System.out.println("total earnings:"+amount);
		if (amount > 1000000)
			taxamt = 0.3 * amount;
		else if (amount > 700000)
			taxamt = 0.2 * amount;
		else if (amount > 500000)
			taxamt = 0.1 * amount;
		else
			taxamt = 0;

		System.out.println("Tax to be paid:" + taxamt);
		income = amount - taxamt;
		System.out.println("income after paying tax:" + income);
	}

}

public class Interfacedemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p;
		p = new Student(1, "abc", 90000);
		p.pay(1000);

		p = new Celebrity("GH1234", "aish roy");
		p.pay(900000);
	}

}
