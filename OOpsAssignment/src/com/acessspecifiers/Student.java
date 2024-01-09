package com.acessspecifiers;
class Student1
{
	void checkStudentVariableAccess() 
	{
		
	}
}
public class Student
{
     private int id;
     int addno;
     protected int age;
     public String course;
     
     public void setId(int id)
     {
    	 this.id=id;
     }
     public int getId()
     {
    	 return id;
     }
     public void setAddno(int addno)
     {
    	 this.addno=addno;
     }
     public int getAddno()
     {
    	 return addno;
     }
     public void setAge(int age)
     {
    	 this.age=age;
     }
     public int getage()
     {
    	 return age;
     }
     public void setCourse(String course)
     {
  	   this.course=course;
     }
     public String getcourse()
     {
  	   return course;
     }
     
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 Student s1=new Student();
		 s1.setAddno(10);
		 s1.setId(01);
		 s1.setAge(20);
		 s1.setCourse("Java");
		 
		 System.out.println("Student:"+ s1.getAddno()+" "+s1.getcourse());

	}

}
