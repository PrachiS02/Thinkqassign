package com.inheritance;

class Student
{
	private int id;
	private String name;
	private double fees;
	
	public Student()
	{
		super();
	}

	public Student(int id, String name, double fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
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

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fees=" + fees + "]";
	}
	
}

class SchoolStudent extends Student
{
	private String sname;
	private int std;
	
	SchoolStudent()
	{
		super();
	}

	public SchoolStudent(int id, String name, double fees, String sname, int std) {
		super(id, name, fees);
		this.sname = sname;
		this.std = std;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	@Override
	public String toString() {
		return super.toString()+"SchoolStudent [sname=" + sname + ", std=" + std + "]";
	}
	
}

class CollegeStudent extends Student
{
	private String uni;
	private String course;
	private int sem;
	
	CollegeStudent()
	{
		super();
	}
     
	public CollegeStudent(int id, String name, double fees, String uni, String course, int sem) {
		super(id, name, fees);
		this.uni = uni;
		this.course = course;
		this.sem = sem;
	}

	public String getUni() {
		return uni;
	}

	public void setUni(String uni) {
		this.uni = uni;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	
	public String toString() {
		return super.toString()+"CollegeStudent [uni=" + uni + ", course=" + course + ", sem=" + sem + "]";
	}
    
	
}
public class Heirarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		SchoolStudent st=new SchoolStudent(1,"Aarti",25000,"VikasBharati",5);
		CollegeStudent ct=new CollegeStudent(101,"sakshi",45000,"DU","BCA",4);
		
		System.out.println(st);
		System.out.println(ct);
	}

}
