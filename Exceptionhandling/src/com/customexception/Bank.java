package com.customexception;

class Account
{
	String name;
	int accno;
	double bal;
	public Account() {
		super();
	}
	public Account(String name, int accno, double bal) {
		super();
		this.name = name;
		this.accno = accno;
		this.bal = bal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", accno=" + accno + ", bal=" + bal + "]";
	}
	
	void deposit(double amount)
	{
		bal+=amount;
		System.out.println("Amount deposited:"+amount);
		System.out.println("New balance: "+bal);
	}
	
	void withdraw(double amount)
	{
		try
		{
			if((this.bal-amount)<0)
				throw new InsuffbalException("your balance is low");
			
			bal-=amount;
			System.out.println("Amount withdrawn:"+amount);
			System.out.println("New balance:"+bal);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
 public class Bank

{
	 public static void main(String[] args) 
	 {
		
		 Account a1= new Account("Reetu",201, 2000);
			a1.deposit(1000);
			System.out.println("--------------------------------------------");
			a1.withdraw(4000);
			System.out.println("--------------------------------------------");
			a1.deposit(2000);
			System.out.println("--------------------------------------------");
			a1.withdraw(4000);
		    
	}
   
}
