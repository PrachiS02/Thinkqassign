package com.interfaces;
interface Account
{
	void deposit();
	void  withdraw();
	void calinterest();
	void viewbal();
	
}
class  Savingaccount implements Account
{
    int bal=10000;

    int amt=5000;
	@Override
	public void deposit()
	{
		bal=bal+amt;
		System.out.println("saving account deposit amount:"+bal);				
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		bal=bal-amt;
		System.out.println("saving account withdraw amount:"+bal);	
	}

	@Override
	public void calinterest() 
	{
		System.out.println("saving account interest: 2%");
		
	}

	@Override
	public void viewbal()
	{
		System.out.println("saving account viewbalance total:"+bal);
		
	}
	

}
class  Currentaccount implements Account
{
    int bal=6000;
    
    int amt=1000;
	@Override
	public void deposit()
	{
		bal=bal+amt;
		System.out.println("current account deposit amount:"+bal);				
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		bal=bal-amt;
		System.out.println("current account withdraw amount:"+bal);	
	}

	@Override
	public void calinterest() 
	{
		System.out.println("current account interest: 2%");
		
	}

	@Override
	public void viewbal()
	{
		System.out.println("current account viewbalance total:"+bal);
		
	}
	

}
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Account b;
   b=new Savingaccount(); 
   b.deposit();
   b.withdraw();
   b.calinterest();
   b.viewbal();
   System.out.println("--------------------------------");
   b=new Currentaccount();
   b.deposit();
   
   
	}

}
