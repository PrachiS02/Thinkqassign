package app.prog;

public class Application 
{
	private double version;
	private String technology;
	private Developer developer;

	void install() 
	{
     System.out.println("installed app");
	}

	void uninstall() 
	{
    System.out.println("uninstall app");
	}

	public Application() {

	}

	public Application(double version, String technology,Developer developer) {
		super();
		this.version = version;
		this.technology = technology;
		this.developer = developer;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public Developer getDeveloper() {
		return developer;
	}

	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}

	@Override
	public String toString() {
		return "Application [version=" + version + ", technology=" + technology + ", developer=" + developer + "]";
	}

	
}
