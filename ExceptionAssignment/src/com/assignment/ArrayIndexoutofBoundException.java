package com.assignment;

public class ArrayIndexoutofBoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]= new int[5];
		
				int arr[]= {1,2,3};
				
				for(int i=0;i<=6;i++) {   // it throws array index out of bound exception
					System.out.println(arr[i]);
				}
				
	}

}
