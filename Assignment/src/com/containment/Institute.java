package com.containment;
class Branch
{
	private int bid;
	private String bname;
	
	Branch()
	{
		
	}

	public Branch(int bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	
	public String toString() {
		return "Branch [bid=" + bid + ", bname=" + bname + "]";
	}
		
}

class Subject
{
	private int sid;
	private String sname;
	
	Subject()
	{
		
	}

	
	public Subject(int sid, String sname) {
		
		this.sid = sid;
		this.sname = sname;
	}


	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}


	public String toString() {
		return "Subject [sid=" + sid + ", sname=" + sname + "]";
	}
		
}
class Topic
{
	private int tid;
	private String tname;
	
	Topic()
	{
		
	}

	public Topic(int tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "Topic [tid=" + tid + ", tname=" + tname + "]";
	}	

}

class Subtopic
{
	private int subid;
	private String subname;
	
	Subtopic()
	{
		
	}

	public Subtopic(int subid, String subname) {
		super();
		this.subid = subid;
		this.subname = subname;
	}

	public int getSubid() {
		return subid;
	}

	public void setSubid(int subid) {
		this.subid = subid;
	}

	public String getSubname() {
		return subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}

	
	public String toString() {
		return "Subtopic [subid=" + subid + ", subname=" + subname + "]";
	}
	
}
class Question
{
	private int qid;
	private String qname;
	
	Question()
	{
		
	}

	public Question(int qid, String qname) {
		super();
		this.qid = qid;
		this.qname = qname;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	
	public String toString() {
		return "Question [qid=" + qid + ", qname=" + qname + "]";
	}
	
	
}
 public class Institute
{
     private int id;
     private String name;
     private Branch branch;
     private Subject subject;
     private Topic topic;
     private Subtopic subtopic;
     private Question question;
     
     Institute()
     {
    	 
     }

	public Institute(int id, String name, Branch branch, Subject subject, Topic topic, Subtopic subtopic,
			Question question) {
		
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.subject = subject;
		this.topic = topic;
		this.subtopic = subtopic;
		this.question = question;
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

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public Subtopic getSubtopic() {
		return subtopic;
	}

	public void setSubtopic(Subtopic subtopic) {
		this.subtopic = subtopic;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	
	public String toString() {
		return "Institute [id=" + id + ", name=" + name + ", branch=" + branch + ", subject=" + subject + ", topic="
				+ topic + ", subtopic=" + subtopic + ", question=" + question + "]";
	}
     
     
     public static void main(String[] args) 
     {
		Branch b1=new Branch(1,"CSE");
		Subject s1= new Subject(2,"Java");
		Topic t1=new Topic(3,"Inheritance");
		Subtopic sb=new Subtopic(4,"types");
		Question q1=new Question(5,"what is inheritance");
		
		Institute i1=new Institute(101,"TQ",b1,s1,t1,sb,q1);
		System.out.println(i1);
		
		
	}
     
}
