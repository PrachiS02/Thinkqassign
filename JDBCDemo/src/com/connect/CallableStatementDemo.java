package com.connect;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class CallableStatementDemo {
	static Connection con = null;
	Statement st;
	ResultSet rs;
    PreparedStatement pst;
    CallableStatement cst;
    
	static Scanner sc = new Scanner(System.in);

	CallableStatementDemo() {
		con = DBConnect.getConnect();
		System.out.println("Connection established..");
		try {
			st = con.createStatement();

		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	// call functions
	//oddeven
	public void callFunction()
	{
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		try
		{
			cst=con.prepareCall("{?= call oddeven(?)}");
			cst.registerOutParameter(1,Types.VARCHAR);
			cst.setInt(2, num);

			boolean status= cst.execute();
			 if(!status)
		        {
		        	System.out.println("The number is:"+cst.getString(1));
		        }
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public void callFunction1()
	{
		System.out.println("Enter the numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		try
		{
			cst=con.prepareCall("{?,?= call maxnum(?,?)}");
			cst.setInt(2, num2);
			cst.setInt(1, num1);
			cst.registerOutParameter(num2, Types.INTEGER);
			
			
			boolean status= cst.execute();
			 if(!status)
		        {
		        	System.out.println("The number is:"+cst.getInt(1));
		        }
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public static void main(String[] args) {
		CallableStatementDemo obj=new CallableStatementDemo();
		//obj.callFunction();
		obj.callFunction1();
	}
}
