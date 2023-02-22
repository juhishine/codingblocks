package Recursion_selfNote;

public class StaticVariablesandlocalVariable {
	//final int n=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3;
		System.out.println(fun(x));
	}
	
	public static int fun(int x)
		{
	    int n=0; //static and global variables are created in main , so value remain same 
		if(x>0)
		 {
		 return fun(x-1)+n;
		 }
		return 0;
	  }
}