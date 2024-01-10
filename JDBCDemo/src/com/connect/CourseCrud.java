package com.connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CourseCrud {
	static Connection con = null;
	Statement st;
	ResultSet rs;
    PreparedStatement pst;
	static Scanner sc = new Scanner(System.in);

	CourseCrud() {
		con = DBConnect.getConnect();
		System.out.println("Connection established..");
		try {
			st = con.createStatement();

		} catch (SQLException e) {
			System.out.println(e);
		}
	}
    
	public void insertCourse()
	   {
		   System.out.println("Enter course id:");
		   int id=sc.nextInt();
		   
		   System.out.println("Enter the course name:");
		   String cname=sc.next();
		   
		   System.out.println("Enter the duration(in months):");
		   int dur=sc.nextInt();
		   
		   System.out.println("Enter fees:");
		   float fees=sc.nextFloat();
		   
		   try {
				pst= con.prepareStatement("insert into course values(?,?,?,?,?)");
				pst.setInt(1, id);
				pst.setString(2, cname);
				pst.setInt(3, dur);
				pst.setFloat(4, fees);
				pst.setInt(5, 0);
				
				int noOfRowsInserted= pst.executeUpdate();
				if(noOfRowsInserted>0)
				{
					System.out.println("Course added....");
				}
				else
				{
					System.out.println("Error in adding the course...");
				}
				
			} catch (SQLException e) {
				System.out.println(e);
			}
			
	   }
	
	public void fetchCourseDetails() {
		try {
			rs = st.executeQuery("select * from course");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + "   " + rs.getInt(3) + "  " + rs.getFloat(4)
						+ "  " + rs.getInt(5));
			}
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	public void deleteCourseById() 
	{
		System.out.println("Enter the courseid to be deleted:");
		int id = sc.nextInt();
		try {
			int noOfRowsDeleted = st.executeUpdate("delete from course where courseid=" +id);
			if (noOfRowsDeleted > 0) {
				System.out.println("Course  " + id + " is deleted");
				System.out.println("---------------------------");
				fetchCourseDetails();
			} 
			else 
			{
				System.out.println("course  not present");
			}
		} catch (SQLException e)
		{
			System.out.println(e);
		}

	}
    public boolean searchCourseById(int id)
    {
    	boolean isFound= false;
		try
		{
			pst= con.prepareStatement("select * from course where courseid=?");
			pst.setInt(1, id);
			
			rs=pst.executeQuery();
			while(rs.next())
			{
				isFound=true;
				System.out.println("Course id:"+rs.getInt(1));
				System.out.println("Course name:"+rs.getString(2));
				System.out.println("Duration:"+rs.getInt(3));
				System.out.println("Fees:"+rs.getFloat(4));
				System.out.println("Number of students:"+rs.getInt(5));
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return isFound;
    }
    
    public void updateCourseFees()
    {
    	System.out.println("Enter course id whose fees to be updated:");
    	int id=sc.nextInt();
    	
    	if(searchCourseById(id))
    	{
    		System.out.println("Enter new Fees:");
    		float fees=sc.nextFloat();
    		try
    		{
    			pst=con.prepareStatement("update course set fees=? where courseid=?");
    			pst.setFloat(1, fees);
    			pst.setInt(2, id);
    			
    			int noOfrowsupdated=pst.executeUpdate();
    			if(noOfrowsupdated>0)
    			{
    				System.out.println("Course fees updated");
    				searchCourseById(id);
    			}
    			
    			else
    			{
    				System.out.println("Error in updating course...");
    			}
    			
    		}catch(Exception e)
    		{
    			System.out.println(e);
    		}
    	}
    }
    public void deleteCourseByName()
    {
    	System.out.println("Enter the course name to deleted:");
    	String name=sc.next();
    	
    	try
    	{
    		int noOfRowsDeleted =st.executeUpdate("delete from course where coursename='"+name+"'");
    		if(noOfRowsDeleted>0)
    		{
    			System.out.println();
    		}
    		
    	}catch(Exception e)
    	{
    		System.out.println(e);
    	}
    }
    
	public static void main(String[] args)
	{
		CourseCrud obj = new CourseCrud();
//		obj.fetchCourseDetails();
//		obj.deleteCourseById();
		
		int choice;
		char ch;
		
		do
		{
			System.out.println("--------------Course deatils--------------------");
			System.out.println("1.Add new Course");
			System.out.println("2.Delete Course");
			System.out.println("3.Update course fees");
			System.out.println("4.View all courses");
			System.out.println("5.View Courses by id");
			System.out.println("6.Exit");
			
			System.out.println("Enter your Choice:");
			System.out.println("--------------------------------------");
			
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1: obj.insertCourse();
			        break;
			case 2: obj.deleteCourseById();
			        break;
		    case 3: obj.updateCourseFees();
			        break;
			case 4: obj.fetchCourseDetails();
			         break;
			case 5: System.out.println("Enter the course id to be searched:");
			        int id=sc.nextInt();
			        boolean isPresent=obj.searchCourseById(id);
			        if(!isPresent)
			        {
			        	System.out.println("Course not found....");
			        }
			        break;
			case 6:System.out.println("--------------close the course application--------------");
			        System.exit(0);
			        break;
			 default:System.out.println("wrong input");      
			}
			
			System.out.println("do you want perform more operation(y-yes/n-no)");
			ch=sc.next().charAt(0);
		
		}while(ch=='y'||ch=='Y');
	}
}
