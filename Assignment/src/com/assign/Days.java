package com.assign;

public class Days {

	public static void main(String[] args) {
		int n,days,weeks,years;
		n=200;
		years=n/365;
		weeks=(n%365)/7;
		days=(n%365)%7;
		System.out.println("Years : " +years);
		System.out.println("Weeks : " +weeks);
		System.out.println("Days : " +days);
		
		

	}

}
