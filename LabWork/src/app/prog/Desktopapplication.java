package app.prog;

public class Desktopapplication extends Application
{
  private String apname;
   private double space;

   public Desktopapplication()
   {
	super();
   }
   public Desktopapplication(double version, String technology, String apname, double space,Developer developer) {
		super(version, technology,developer);
		this.apname = apname;
		this.space = space;
	}

	public String getApname() {
		return apname;
	}

	public void setApname(String apname) {
		this.apname = apname;
	}

	public double getSpace() {
		return space;
	}

	public void setSpace(double space) {
		this.space = space;
	}
	@Override
	public String toString() {
		return "Desktopapplication [apname=" + apname + ", space=" + space + "" +super.toString();
	}
   
   
   
}
