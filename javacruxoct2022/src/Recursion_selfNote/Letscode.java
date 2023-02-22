package Recursion_selfNote;

public class Letscode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3;
		fun(x);
	}
	public static void fun(int x)// Head recursion
		{
		if(x>0)
		 {
		 fun(x-1);
	     System.out.println(x);
		 }
	  }
//	public static void fun(int x)// Tail recursion
//	{
//	if(x>0)
//	 {
//    System.out.println(x);
//	 fun(x-1);
//	 }
//  }

}
