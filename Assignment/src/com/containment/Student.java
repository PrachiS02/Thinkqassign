package com.containment;

public class Student 
{
	private int sroll;
	   private String sname;
	   private Department1 department1;
	   
	   Student()
	   {
		   
	   }
	   Student(int sroll,String sname,Department1 department1)
	   {
		   this.sroll=sroll;
		   this.sname=sname;
		   this.department1=department1;
	   }

		public Department1 getDepartment1() {
			return department1;
		}

		public void setDepartment1(Department1 department1) {
			this.department1 = department1;
		}
		public int getSroll() {
			return sroll;
		}

		public void setSroll(int sroll) {
			this.sroll = sroll;
		}

		public String getSname() {
			return sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}
		
		public String toString() {
			return "Student [sroll=" + sroll + ", sname=" + sname + ", department=" + department1 + "]";
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	 
			Department1 d=new Department1(101,"FoodTech");
			Department1 d2=new Department1(102,"Microbio");
			
			Student s1=new Student(1,"Raj",d);
			Student s2=new Student(2,"Raju",d2);
			
			System.out.println(s1);
			System.out.println(s2);
		

}
}
