package com.constructor2;

public class Compare 
{
	
   void Compare(int a,int b)
   {
	   if(a>b)
		   System.out.println(a);
	   else
		   System.out.println(b);
   }
   
   void Compare(char a, char b)
   {
	   int x=(int) a;
	   int y=(int)b;
	   
	   if(x>y)
		   System.out.println(a);
	   else
		   System.out.println(b);
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Compare c1=new Compare();
      c1.Compare(10, 20);
      c1.Compare('a', 'h');
      
	}

}
