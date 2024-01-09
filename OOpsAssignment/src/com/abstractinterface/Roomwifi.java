package com.abstractinterface;
class Wifi1 {
	 void wifi() {
		System.out.println("wifi available");
	}
}

class Roompeople extends Wifi1 {
   void wifi() {
		System.out.println("wifi only in room");
	}
}
public class Roomwifi 
{


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Wifi1 rf;
    rf=new Roompeople();
    rf.wifi();
    
	}

}
