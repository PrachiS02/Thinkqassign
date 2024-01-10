package com.innerdemo;

class Bank
{
	private static String bname="IDBI Bank";
	static String bankloc;
	static String ifsccode;
	String aname;
	int accno;
	double balance;
	
	static
	{
		bankloc="satara";
		ifsccode="SBI8967DF";
	}
	Bank()
	{
		
		
	}

	Bank(String aname,int accno,double balance)
	{
		this.aname=aname;
		this.accno=accno;
		this.balance=balance;
		
	}
	
	void displayBankdetails()
	{
		System.out.println(bname+" "+bankloc);
	    System.out.println("IFSCcode:"+ifsccode);
	}
	
	class Locker
	{
		int lockerid;
		String pass;
		static double Lockerrent=2000;
	
	 Locker()
	 {
		 
	 }

	public Locker(int lockerid, String pass) {
		super();
		this.lockerid = lockerid;
		this.pass = pass;
	}
		
	 void displayLockerDetails()
	 {
		 displayBankdetails();
		 System.out.println("This locker belongs to:"+aname+" with account no:"+accno+" Balance:"+balance);
		 System.out.println("Locker id:"+lockerid);
		 System.out.println("Rent:"+Lockerrent);
	 }
			
		
	}
	
	
}
public class MemberInnerclass
{
   public static void main(String[] args) 
   {
	//Bank$Locker
	//1st way
	   
	  Bank cust1=new Bank("prachi",8970,10000);
	  cust1.displayBankdetails();
	  
	  System.out.println("--------------------------------");
	  
	  Bank.Locker locker1=cust1.new Locker(20,"P123");
	  locker1.displayLockerDetails();
	  
	  System.out.println("----------------------");
	  
	  //2nd way
	  
	  Bank.Locker locker2=new Bank("Akshay Khamkar",9090,1000000).new Locker(30,"akshay123");
	  locker2.displayLockerDetails();
   }
	
	
	
}
