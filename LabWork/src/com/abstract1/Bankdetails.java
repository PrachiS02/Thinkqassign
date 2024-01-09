package com.abstract1;

abstract class Bank {
	abstract void getbalance();
}

class BankA extends Bank {
	int depamt = 100;

	@Override
	void getbalance() {
		System.out.println("BankA has deposit amount:" + depamt);

	}
}

class BankB extends Bank {
	int depamt = 150;

	@Override
	void getbalance() {
		System.out.println("BankB has deposit amount:" + depamt);

	}
}

class BankC extends Bank {
	int depamt = 200;

	@Override
	void getbalance() {
		System.out.println("BankC has deposit amount:" + depamt);

	}

}

public class Bankdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;
		b = new BankA();
		b.getbalance();

		b = new BankB();
		b.getbalance();

		b = new BankC();
		b.getbalance();
	}

}
