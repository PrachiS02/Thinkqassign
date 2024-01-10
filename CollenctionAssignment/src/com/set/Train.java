package com.set;

public class Train implements Comparable<Train>{
	private int id;
	private String name;
	private int seat;

	public Train() {
		super();

	}

	public Train(int id, String name, int seat) {
		super();
		this.id = id;
		this.name = name;
		this.seat = seat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	@Override
	public String toString() {
		return "Train [id=" + id + ", name=" + name + ", seat=" + seat + "]";
	}

	@Override
	public int compareTo(Train o) {
		
		return this.getSeat()-o.getSeat();
	}

}
