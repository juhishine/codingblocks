package Jan29_lecture22_recursion2;

public class fibonacii_recursion_headrecursion {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //int n=5;// fib(5)=15calls, fib(40=9 calls, time taken o(2^n)
  
  System.out.println(fib(5));
	}
	
//	public static int fib(int n)
//	{// Excessive recursion
//
//		if(n==0||n==1)
//			return n;
//		int f1=fib(n-1);
//		int f2=fib(n-2);
//		return f1+f2;
//		/*
//		 n=5> fib(4)+fib(3)
//		 	 n=4> fib(3)+fib(2)
//		 	 	 n=3> fib(2)+fib(1)
//		 	 	 	 n=2> fib(1)+fib(0)
//		 	 	 	 tree is created , many stacks developed 
//		 */
//		//return fib(n-1)+fib(n-2);
//	}
	//recursion by memoisation 
	public static int fib(int n)
	{		 
		int[] f=new int[n];
	    for(int i=0;i<n;i++)
		  f[i]= -1;
		if(n<=1)
		{
		f[n]=n;
		return n;
		}
		else
		{
			if(f[n-2]==-1)
				f[n-2]=fib(n-2);
			if(f[n-1]==-1)
				f[n-1]=fib(n-1);
			return f[n-2]+f[n-1];
			
		}
	}
}
