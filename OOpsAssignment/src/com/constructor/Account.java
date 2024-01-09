package com.constructor;

public class Account
{
	public long accountNo;
	 public String customerName;
	 
	/* public Account()
	 {
		 System.out.println("I am in default consturctor");
	 }*/
	 
	public Account(long accountNo, String customerName)
	{
         this.accountNo=accountNo;
         this.customerName=customerName;
         System.out.println("I am in parametirized Construcor");
	}
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public String toString() 
	{
		return "AccountNo :"+accountNo+ " \nCustomerName:"+customerName;
	}

	 public static void main(String[] args) {
     Account a1=new Account(10,"prachi");
     System.out.println(a1);
     
     //Account a2=new Account(20,"riya");
    // System.out.println(a2);
     
     Account a3=new Account();
     System.out.println(a3);
     

	}

}
