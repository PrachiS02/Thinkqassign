package com.containment;

public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Course c1=new Course(101,"Java",25000);
     Course c2=new Course(102,"Python",45000);
     Course c3=new Course(101,"C++",22000);
     
     Student s1=new Student(1,"prachi", c3);
     Student s2=new Student(2,"priti", c1);
     Student s3=new Student(3,"pranay", c2);
     
     System.out.println(s1);
     System.out.println(s2);
     System.out.println(s3);
     
     //anonymous object
     
     new Student(4,"pooja",c1);
     
     Student s4=new Student(4,"aniket",new Course(104,"hii",85000));
     Student s5=new Student(5,"aditya",new Course(104,"hii",85000));
     
     System.out.println(s4);
     System.out.println(s5);
     
     ///////////////////////////////////////
     
     Course c=new Course();
     c.setCid(105);
     c.setCname("dotnet");
     c.setFees(45000);
     
     Student s=new Student();
     s.setSid(8);
     s.setSname("raj");
     s.setCourse(c);
     
     System.out.println(s);
     //////////////////////////////////////////
     
     Student st=new Student();
     st.setSid(5);
     st.setSname("payal");
     st.setCourse(new Course());
     st.getCourse().setCid(106);
     st.getCourse().setCname("Angular");
     st.getCourse().setFees(55000);
     
     System.out.println(st);
	}

}
