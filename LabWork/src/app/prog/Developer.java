package app.prog;

  public class Developer 
 {
   private String devname;
   private int devexp;
   private String skills;
   
  void debugApp()
   {
	   System.out.println("debugging completed");
   }
    void integrateCode()
    {
    	System.out.println("integrated code");
    }
   Developer()
   {
	   super();
   }
  public Developer( String devname, int devexp, String skills) {
	super();
	this.devname = devname;
	this.devexp = devexp;
	this.skills = skills;
    }

	public String getDevname() {
		return devname;
	}

	public void setDevname(String devname) {
		this.devname = devname;
	}

	public int getDevexp() {
		return devexp;
	}

	public void setDevexp(int devexp) {
		this.devexp = devexp;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Developer [devname=" + devname + ", devexp=" + devexp + ", skills=" + skills + "]";
	}
	
	
 }
