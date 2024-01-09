package labassignment;

import java.util.Scanner;

public class TempDrop {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
	        System.out.println("enter the temperature:");
	        int n=sc.nextInt();
	        
	        timeRequireTodropTempBelow60(n);		

	}

	private static void timeRequireTodropTempBelow60(int n) {
		// TODO Auto-generated method stub
		int count =0;
		
		while(n>=60) {
			count++;
			n=n-7;
		}
		
		System.out.println(count);
		
	}

}
