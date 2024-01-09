package com.abstractinterface;
interface Employee
{

	abstract void salary();
	
}
class Parttime implements Employee
{
	   int id;
	   String name;
	   int hrswork;

	Parttime()
	{
		
	}
	public Parttime(int id, String name, int hrswork) {
		super();
		this.id = id;
		this.name = name;
		this.hrswork = hrswork;
	}
	@Override
	public void salary() 
	{
	   System.out.println("part-time employess have 200 rs. salary");
		
	}
	@Override
	public String toString() {
		return "Parttime employee: id=" + id + ", name=" + name + ", hrswork=" + hrswork;
	}
	
	
}
class Fulltime implements Employee
{
    int id;
    String name;
    int hrswork;
	@Override
	public void salary() 
	{
	   System.out.println("Full-time employess have 500 rs. salary");
		
	}
	Fulltime()
	{
		
	}
	public Fulltime(int id, String name, int hrswork) {
		super();
		this.id = id;
		this.name = name;
		this.hrswork = hrswork;
	}
	@Override
	public String toString() {
		return "Fulltime Employee: id=" + id + ", name=" + name + ", hrswork=" + hrswork ;
	}
	
	

}
public class Companyemp
{

	public static void main(String[] args) {
	
		Employee e;
		e=new Parttime(1,"abc",8);
	
		System.out.println(e);
		e.salary();
		System.out.println("----------------------------------------------------");
		e=new Fulltime(2,"raj",9);
		System.out.println(e);
		e.salary();
		
	}

}
