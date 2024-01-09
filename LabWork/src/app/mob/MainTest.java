package app.mob;
import app.prog.Desktopapplication;
import app.prog.Developer;
import app.prog.Webapplication;
public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method s,"tub
      Developer d=new Developer("arya",8,"java");
      System.out.println(d);
      Webapplication wa=new Webapplication(1.2, "web120", "html", d);
     System.out.println(wa);
     Mobileapplication mb=new Mobileapplication(1.2,"android", "Whatsapp", 2.6, d);
     System.out.println(mb);
     Desktopapplication da=new Desktopapplication(1.2,"jdk", "eclipse", 1.6, d);
     System.out.println(da);
     
      
	}

}
