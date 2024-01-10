package com.connect;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class CallableStatementDemo2 {
	static Connection con = null;
	Statement st;
	ResultSet rs;
    PreparedStatement pst;
    CallableStatement cst;
    
	static Scanner sc = new Scanner(System.in);

	CallableStatementDemo2() {
		con = DBEmpConnect.getConnect();
		System.out.println("Connection established..");
		try {
			st = con.createStatement();

		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	// call function
	public void callFunction2()
	{
		System.out.println("Enter department id:");
		int id=sc.nextInt();
		
		try
		{
			cst= con.prepareCall("{?= call totalsal(?) }");
			cst.registerOutParameter(1, Types.INTEGER);
			cst.setInt(2, id);
			
			boolean status= cst.execute();
	        if(!status)
	        {
	        	System.out.println("The total salary is:"+cst.getInt(1));
	        }
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void callStoredPro1()
	{
		System.out.println("Enter a salary:");
		float salary=sc.nextFloat();
		
		try {
			
			cst= con.prepareCall("{call empdetailssal(?)}");
			cst.setFloat(1, salary);
			
			boolean status= cst.execute();
			if(status)
			{
				rs= cst.getResultSet();
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
				}
			}
			
		} catch (Exception e) {
		
			System.out.println(e);
		}
	}
	public void callStoredPro2()
	{
		System.out.println("Enter a employeeid:");
		int id= sc.nextInt();
		
		try {
			
			cst= con.prepareCall("{call empdetails2(?,?,?)}");
			cst.setInt(1, id);
			cst.registerOutParameter(1, Types.INTEGER);
			cst.registerOutParameter(2, Types.VARCHAR);
			cst.registerOutParameter(3, Types.FLOAT);
			
			boolean status= cst.execute();
			if(status)
			{
				rs= cst.getResultSet();
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
				}
			}
			
		} catch (Exception e) {
		
			System.out.println(e);
		}
		
	}
	 //call stored procedure deptwisesalary
	 public void StoredPro3()
	   {
		 System.out.println("Enter a departmentid:");
			int id= sc.nextInt();
			
			try
			{
			 
				
			}catch(Exception e)
			{
				System.out.println(e);
			}
		   
	   }
	public static void main(String[] args) {
		CallableStatementDemo2 obj=new CallableStatementDemo2();
		//obj.callFunction2();
		//obj.callStoredPro1();
		obj.callStoredPro2();
	}
}
