package com.overriding;
class Developer
{
	final String ename;
	float salary;
	final static String compname;
	final static int noofhrs=8;
	final String panno;
	
	static
	{
		compname="TQ";
	}

//	{
//		panno="unknown"
//	}
	public Developer()
	{
		ename="unknown";
		panno="unknown";
	}
	public Developer(String ename, float salary, String panno) {
		super();
		this.ename = ename;
		this.salary = salary;
		this.panno = panno;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getEname() {
		return ename;
	}
	public static String getCompname() {
		return compname;
	}
	public static int getNoofhrs() {
		return noofhrs;
	}
	public String getPanno() {
		return panno;
	}
	
}
class Fullstack extends Developer
{

	


}
public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
