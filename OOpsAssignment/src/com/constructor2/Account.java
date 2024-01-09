package com.constructor2;

public class Account 
{
   public long accno;
   public String cname;
   
  Account()
   {	   System.out.println("I am in default Constructor");
  }
   Account(long accno,String cname)
   {
	   this.accno=accno;
	   this.cname=cname;
	   System.out.println("I am in parametirized Constructor");
   }
	@Override
public String toString() {
	return "Account [accno=" + accno + ", cname=" + cname + "]";
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Account a1=new Account(101,"abc");
         //a1.accno=101;
        // a1.cname="abc";
        //System.out.println(a1);
        
        Account a2=new Account();
        a2.accno=102;
        a2.cname="raj";
        System.out.println(a2);
        
        Account a3=new Account(100,"prachi");
         System.out.println(a3);
	}
}
