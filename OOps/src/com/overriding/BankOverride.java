package com.overriding;

class Account
{
	private int accno;
	private String name;
	private double bal;
	
	Account()
	{
		
	}
	public Account(int accno, String name, double bal) {
		super();
		this.accno = accno;
		this.name = name;
		this.bal = bal;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	void deposit(float amt)
	{
		bal+=amt;
		System.out.println(accno);
		System.out.println("Account is credited by :"+amt);
		System.out.println("New balance:"+bal);
		
	}
	void withdraw(float amt)
	{
	if((bal-amt)>0)
	{
		bal-=amt;
		System.out.println(accno);
		System.out.println("Account is debited by :"+amt);
		System.out.println("New balance:"+bal);
		
	}
	else
	{
		System.out.println(accno);
		System.out.println("insufficient bal:"+bal);
	}
}
	
class SavingAccount extends Account
{
	 private String panno;
	 
	 public SavingAccount()
	 {
		 super();
	 }
     
	

	public SavingAccount(int accno, String name, double bal) {
		super(accno, name, bal);
	}

	    

	public SavingAccount(String panno) {
		super();
		this.panno = panno;
	}



	public String getPanno() {
		return panno;
	}

	public void setPanno(String panno) {
		this.panno = panno;
	}

	void deposit(float amt)
	{
		if(((bal+amt)>50000)&&(panno==null))
		{
			System.out.println("Please provide pan number as balance exceeds 50000");
		}
		else
		{
			super.deposit(amt);
		}

	}



	@Override
	public String toString() {
		return "SavingAccount [panno=" + panno + ", getPanno()=" + getPanno() + ", getAacno()=" + getAccno()
				+ ", getName()=" + getName() + ", getBal()=" + getBal() + ", toString()=" + super.toString() + "]";
	}



	
	 
}
}
  public class BankOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Account a1=new Account(1,"prachi",20000);
    a1.deposit(2000);
    
    
    
	}

}

