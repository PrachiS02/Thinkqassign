package com.abstractinterface;

class Wifi {
	protected void wifi() {
		System.out.println("wifi available");
	}
}

class Emproom extends Wifi {
	protected void wifi() {
		System.out.println("wifi is accessed by adjacent room in emp room");
	}
}

class Adminstaff extends Emproom {
	protected void wifi() {
		System.out.println("wifi is accessed by adjacent room in admin room");
	}

}

public class Adjacentroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wifi wf;
		wf = new Emproom();
		wf.wifi();
		wf = new Adminstaff();
		wf.wifi();

	}

}
