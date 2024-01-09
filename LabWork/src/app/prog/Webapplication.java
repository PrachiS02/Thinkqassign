package app.prog;
import app.prog.Application;
public class Webapplication extends Application
{
  private String appname;
  
  Webapplication()
  {
	  super();
  }

	public Webapplication(double version, String technology, String appname,Developer developer) {
		super(version, technology,developer);
		this.appname = appname;
	}

	public String getAppname() {
		return appname;
	}

	public void setAppname(String appname) {
		this.appname = appname;
	}

	@Override
	public String toString() {
		return "Webapplication [appname=" + appname + " "+super.toString();
	}

	

	
}
