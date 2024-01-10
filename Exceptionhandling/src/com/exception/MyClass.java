package com.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyClass 
{
	public void myMethod1() {
		System.out.println("Inside myMethod1");
		try {
			myMethod2();
		} catch (Exception e) {
			System.out.println("Caught Exception in myMethod1: " + e.getMessage());
		}
	}

	public void myMethod2() {
		System.out.println("Inside myMethod2");
		myMethod3();
	}

	public void myMethod3() {
		System.out.println("Inside myMethod3");
		try {

			File file = new File("filename.txt");
			Scanner sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("Caught FileNotFoundException in myMethod3: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.myMethod1();
	}

}
