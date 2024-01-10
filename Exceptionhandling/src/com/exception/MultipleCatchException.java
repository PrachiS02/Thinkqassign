package com.exception;

public class MultipleCatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
			
			int[] array= new int[3];
			int value=array[5];
			int result=10/0;
		
			String str=null;
			int length=str.length();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundException");
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic exception");
		}catch(NullPointerException e) {
			System.out.println("nullPointerException");
		}
		catch(Exception e) {
			System.out.println();
		}
	}

	}


