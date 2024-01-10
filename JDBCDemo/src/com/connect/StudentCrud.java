package com.connect;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class StudentCrud 
{
	static Connection con = null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	static Scanner sc = new Scanner(System.in);
	SimpleDateFormat inputdate=new SimpleDateFormat("yyyy-MM-dd");
	StudentCrud()
	{
		con=DBConnect.getConnect();
		System.out.println("Connection established..");
		try {
			st = con.createStatement();

		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	public void insertStudent()
	   {
		   System.out.println("Enter student id:");
		   int id=sc.nextInt();
		   
		   System.out.println("Enter the student name:");
		   String sname=sc.next();
		   
		   System.out.println("Enter the student phone no:");
		   Long phnno=sc.nextLong();
		   
		   System.out.println("Enter EmailId:");
		   String mail=sc.next();
		   
		   System.out.println("Enter course id:");
		   int cid=sc.nextInt();
		   
		   System.out.println("Enter Feestatus:");
		   String status=sc.next();
		   
		   System.out.println("Enter Joining Date:");
		   
		   String joind=sc.next();
		  
		   java.sql.Date sqdoj=java.sql.Date.valueOf(joind);
	
	       
		   try {
				pst= con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
				pst.setInt(1, id);
				pst.setString(2, sname);
				pst.setLong(3, phnno);
				pst.setString(4, mail);
				pst.setInt(5, cid);
				pst.setString(6, status);
     			pst.setString(7,joind );
				int noOfRowsInserted= pst.executeUpdate();
				if(noOfRowsInserted>0)
				{
					System.out.println("Student added....");
				}
				else
				{
					System.out.println("Error in adding the Student...");
				}
				
			} catch (SQLException e) {
				System.out.println(e);
			}
			
	   }
	public void fetchStudentDetails() {
		try {
			rs = st.executeQuery("select * from student");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getLong(3) + "  " + rs.getString(4)+"  "+rs.getInt(5)+"  "+rs.getString(6)+"  "+rs.getDate(7));
			}
		} catch (SQLException e) {
			System.out.println(e);
		}

	}
	public void deleteStudentById() 
	{
		System.out.println("Enter the studentid to be deleted:");
		int id = sc.nextInt();
		try {
			int noOfRowsDeleted = st.executeUpdate("delete from student where studid="+id);
			if (noOfRowsDeleted > 0) {
				System.out.println("Student  " + id + " is deleted");
				System.out.println("---------------------------");
				fetchStudentDetails();
			} 
			else 
			{
				System.out.println("student not present");
			}
		} catch (SQLException e)
		{
			System.out.println(e);
		}

	}
	public boolean searchStudentById(int id)
    {
    	boolean isFound= false;
		try
		{
			pst= con.prepareStatement("select * from student where studid=?");
			pst.setInt(1, id);
			
			rs=pst.executeQuery();
			while(rs.next())
			{
				isFound=true;
				System.out.println("Student id:"+rs.getInt(1));
				System.out.println("Student name:"+rs.getString(2));
				System.out.println("Phone No:"+rs.getLong(3));
				System.out.println("Email:"+rs.getString(4));
				System.out.println("Course Id:"+rs.getInt(5));
				System.out.println("FeeStatus:"+rs.getString(6));
				System.out.println("Joining Date:"+rs.getString(7));
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return isFound;
    }
	public void updateStudentfeestatus()
    {
    	System.out.println("Enter student id whose fees status to be updated:");
    	int id=sc.nextInt();
    	
    	if(searchStudentById(id))
    	{
    		System.out.println("Enter new Feestatus:");
    		String feestatus=sc.next();
    		try
    		{
    			pst=con.prepareStatement("update student set feestatus=? where studid=?");
    			pst.setString(1, feestatus);
    			pst.setInt(2, id);
    			
    			int noOfrowsupdated=pst.executeUpdate();
    			if(noOfrowsupdated>0)
    			{
    				System.out.println("Student feestatus updated");
    				searchStudentById(id);
    			}
    			
    			else
    			{
    				System.out.println("Error in updating student feestatus...");
    			}
    			
    		}catch(Exception e)
    		{
    			System.out.println(e);
    		}
    	}
    }
    public static void main(String[] args) 
    {
		StudentCrud obj=new StudentCrud();
		//obj.fetchStudentDetails();
		//obj.deleteStudentById();
		//obj.updateStudentfeestatus();
		int choice;
		char ch;
		
		do
		{
			System.out.println("--------------Student deatils--------------------");
			System.out.println("1.Add new Student");
			System.out.println("2.Delete Student");
			System.out.println("3.Update Student feestatus");
			System.out.println("4.View All student");
			System.out.println("5.View students by id");
			System.out.println("6.Exit");
			
			System.out.println("Enter your Choice:");
			System.out.println("--------------------------------------");
			
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1: obj.insertStudent();
			        break;
			case 2: obj.deleteStudentById();
			        break;
		    case 3: obj.updateStudentfeestatus();
			        break;
			case 4: obj.fetchStudentDetails();
			         break;
			case 5: System.out.println("Enter the student id to be searched:");
			        int id=sc.nextInt();
			         boolean isPresent=obj.searchStudentById(id);
			        if(!isPresent)
			        {
			        	System.out.println("student not found....");
			        }
			        break;
			case 6:System.out.println("--------------close the student application--------------");
			        System.exit(0);
			        break;
			 default:System.out.println("wrong input");      
			}
			
			System.out.println("do you want perform more operation(y-yes/n-no)");
			ch=sc.next().charAt(0);
		
		}while(ch=='y'||ch=='Y');
	}
	}

