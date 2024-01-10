package com.methodoverloading;
class Hotels
{
//doesnot differentiate on the basis of return type
void calArea(int length)
{
	   System.out.println("Area :"+length*length);
}

//int calcArea(int length)
//{
//	   System.out.println("Area:"+(length*2));
//}

 int calArea(int length, int breadth)
{
	  return (length*breadth);
}

void calVolume(int length)
{
	   System.out.println("Volume :"+length*length*length);
}

void calVolume(int length, int breadth,int height)
{
	   System.out.println("Volume :"+length*breadth*height);
}


}
public class Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Room r1 = new Room();
		r1.calArea(5);
		r1.calVol(5);
		
		Room r2= new Room();
		//System.out.println("Area:"+r2.calArea(5,6));
		r2.calVol(5, 6, 10);
	}

}
