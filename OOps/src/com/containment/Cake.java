package com.containment;

class Cake
{
	private String flavour;
	private float price;

	Cake() {

	}

	Cake(String flavour, float price) {
		this.flavour = flavour;
		this.price = price;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
