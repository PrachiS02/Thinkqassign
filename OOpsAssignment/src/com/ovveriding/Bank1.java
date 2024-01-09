package com.ovveriding;
class Bank
{
	public void displayInterestrate()
	{
		System.out.println("default account:interest rate-2%");
	}
}
class Savingaccount extends Bank
{
	@Override
	public void displayInterestrate()
	{
		System.out.println("saving account:interest rate-3%");
	}
}
class Currentaccount extends Bank
{
	@Override
	public void displayInterestrate()
	{
		System.out.println("current account:interest rate-5%");
	}
}
public class Bank1 
{
	public static void main(String[] args) 
	{
		   Bank b=new Bank();  
		   b.displayInterestrate();
		   Savingaccount sa=new Savingaccount();
		   sa.displayInterestrate();
		   Currentaccount ca=new Currentaccount();
		   ca.displayInterestrate();
	}
   
   
    
}
