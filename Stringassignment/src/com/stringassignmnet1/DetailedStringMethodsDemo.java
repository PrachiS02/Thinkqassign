package com.stringassignmnet1;

public class DetailedStringMethodsDemo 
{
	private void concatAtDemo() 
	{
		String s1="Java";
		
		
	}
	private void charAtDemo() 
	{
		 String s1="Java";
		 char result=s1.charAt(1);
		 System.out.println("charAtDemo:"+result);
		
		
	}

	private void equalsIgnoreCaseDemo()
	{
		String s1="Java";
		String s2="java";
		boolean result=s1.contentEquals(s2);
		System.out.println("equalsIgnorecase:"+result);
		
	}

	private void copyValueOfDemo() 
	{
		  char ch[]= {'a','b','c','d'};
		  String result=String.copyValueOf(ch);
		  System.out.println("copyValueOfDemo: "+result);
		  
			
	}
	private void contentEqualsDemo() 
	{
		String s1="India";
		StringBuilder s2= new StringBuilder("India");
		boolean result=s1.contentEquals(s2);
		System.out.println("ContentEqualsDemo:"+result);
			
		}
	private void indexOfDemo()
	{
		String s="Java";
		int result=s.indexOf(3);
		System.out.println("indexOfDemo:"+result);
		
		
	}

	private void lengthDemo() {
		// TODO Auto-generated method stub
		
	}

	private void matchesDemo() {
		// TODO Auto-generated method stub
		
	}

	private void replaceDemo() {
		// TODO Auto-generated method stub
		
	}

	private void splitDemo() {
		// TODO Auto-generated method stub
		
	}

	private void toUpperCaseDemo() {
		// TODO Auto-generated method stub
		
	}

	private void trimDemo() {
		// TODO Auto-generated method stub
		
	}

	

	

	private void compareToStringDemo() {
		// TODO Auto-generated method stub
		
	}

	private void compareToObjectDemo() {
		// TODO Auto-generated method stub
		
	}

	

	public static void main(String[] args) 
	{
	
		DetailedStringMethodsDemo s = new DetailedStringMethodsDemo();
     	s.charAtDemo(); // charAt() method;
		s.compareToObjectDemo();// compareTo() String compareTo(Object o) Method
		s.compareToStringDemo();// String compareTo(String anotherString) Method
		s.compareToStringDemo();// String compareToIgnoreCase(String str)Method
		s.concatAtDemo();// concat() method
		s.contentEqualsDemo();// contentEquals() method
		//s.copyValueOfDemo();// copyValueOf() method
		s.equalsIgnoreCaseDemo(); // equalsIgnoreCase()
		s.indexOfDemo();// indexOf() method
		s.indexOfDemo();// lastIndexOf() method
		s.lengthDemo();// length() method
		s.matchesDemo();// matches() method
		s.replaceDemo();// replace() method
		s.splitDemo();// //split() method
		s.compareToStringDemo();// substring() method
		s.toString();// toString() method
		s.toUpperCaseDemo();// toUpperCase() method
		s.toUpperCaseDemo();// toUpperCase() method
		s.trimDemo();// trim() method
		s.copyValueOfDemo();// valueOf() method
		s.hashCode();// hashCode() method


	
	

	
		

}
	
	 
}
