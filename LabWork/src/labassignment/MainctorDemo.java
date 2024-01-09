package labassignment;
 class Ctor
{
	 private static int counter=121;
  void Ctor()
  {
	  counter=212;
	  System.out.println(Ctor.counter);
  }
  Ctor(int x)
  {
	  counter=x;
	  Ctor();
  }
}
public class MainctorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Ctor bg=new Ctor(112);
	}

}
