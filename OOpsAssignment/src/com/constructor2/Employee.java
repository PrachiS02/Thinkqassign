package com.constructor2;

public class Employee
{
   private int eid;
   private String name;
   private int sal;
   
   Employee()
   {
	   
   }
   Employee(int eid,String name,int sal)
   {
	   this.eid=eid;
	   this.name=name;
	   this.sal=sal;
   }
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee e1=new Employee();
       e1.setEid(10);
       e1.setName("Sakshii");
       e1.setSal(25000);
       System.out.println(e1);
       Employee e2=new Employee(101,"abc",45000);
       System.out.println(e2);
       
	}

}
