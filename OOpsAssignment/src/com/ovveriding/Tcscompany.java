package com.ovveriding;
class Company
{
	public void address()
	{
		System.out.println("This is company address");
	}
}

class ebay extends Company
{
	public void address()
	{
		super.address();
		System.out.println("This is ebay address");
	}
}
public class Tcscompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Company c=new Company();
        c.address();
        ebay e=new ebay();
        e.address();
	}

}
