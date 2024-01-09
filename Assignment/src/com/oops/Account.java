package com.oops;

public class Account 
{
    int accno;
    String name;
    float amt;
    float bal;
    
   void insert()
    {
    	this.accno=123;
    	this.name="abc";
    	this.bal=1000;
    }
   
   public void deposit(int d)
   {
	   bal+=d;
   }
   public void withdraw(int w)
   {
	   bal+=w;
   }
   public void checkbalance()
   {
	   System.out.println("bal:"+bal);
   }
   void display()
   {
	   System.out.println("accno :"+accno);
	   System.out.println("name: "+name);
	  
	  
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Account a1=new Account();
       a1.insert();
       a1.deposit(1000);
       a1.withdraw(500);
       a1.checkbalance();
       a1.display();
	}

}
