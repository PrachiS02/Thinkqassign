package labassignment;

import java.util.Scanner;

public class MilkPrice 
{

	
	private static void fourWeekPrices(int price) {
		// TODO Auto-generated method stub
		
		
		for(int i=2;i<10;i++) {
			System.out.println(price+(7*i));
			i++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sasda = new Scanner(System.in);
		
		System.out.println("Enter Todays Milk Price = ");
		
		int price =sasda.nextInt();
		
		fourWeekPrices(price);

	}

	

}
