package com.assign;

public class CompSi {

	public static void main(String[] args)
	{
		double prin,time,rate,si,ci;
		prin=34000;
		rate=30;
		time=5;
		si=(prin*rate*time)/100;
		ci=prin*Math.pow(1+(rate/100),time)-prin;
		System.out.println("Simple Interest   : "+si);
		System.out.println("Compound Interest : "+ci);


	}

}
