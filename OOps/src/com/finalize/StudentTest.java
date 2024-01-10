package com.finalize;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student s=new Student(1,"abc");
      
      System.out.println(s);
      s=null;
      System.gc();
	}

}
