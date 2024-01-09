package com.abstractinterface;
final class Locker
{
	private double money;
	private String jewellary;
	private int pincode;
	
	Locker()
	{
		
	}

	public Locker(double money, String jewellary, int pincode)
	{
		super();
		this.money = money;
		this.jewellary = jewellary;
		this.pincode = pincode;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getJewellary() {
		return jewellary;
	}

	public void setJewellary(String jewellary) {
		this.jewellary = jewellary;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Locker: money=" + money + ", jewellary=" + jewellary + ", pincode=" + pincode + "";
	}
	
	
}
public class Locker1 {

	public static void main(String[] args) 
	{
		Locker l=new Locker(89000.00,"necklace",89089);
		l.getMoney();
		l.getJewellary();
		l.getPincode();
		System.out.println(l);

	}

}
