package com.oopslab;
class Address
{
	private int roomno;
	private String city;
	private String pincode;
	
	Address()
	{
		
	}

	public Address(int roomno, String city, String pincode) {
		super();
		this.roomno = roomno;
		this.city = city;
		this.pincode = pincode;
	}

	public int getRoomno() {
		return roomno;
	}

	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPicode() {
		return pincode;
	}

	public void setPicode(String pincode) {
		this.pincode = pincode;
	}

	
	public String toString() {
		return "Address [roomno=" + roomno + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
}
public class Person1
{
  private String name;
  private int age;
  private String mail;
  private Address address;
  
  Person1()
  {
	  
  }
  
	public Person1(String name, int age, String mail, Address address) 
	{

	this.name = name;
	this.age = age;
	this.mail = mail;
	this.address = address;
    }
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public String toString() {
		return "Person1 [name=" + name + ", age=" + age + ", mail=" + mail + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address a1=new Address(102,"Satara","415501");
		Person1 p1=new Person1("Raj",25,"Raj@gmail.com",a1);
		
		System.out.println(p1);
	}

}
