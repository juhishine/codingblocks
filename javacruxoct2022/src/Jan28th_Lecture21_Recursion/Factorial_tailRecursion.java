package Jan28th_Lecture21_Recursion;

public class Factorial_tailRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;int y=1;
		System.out.println(fac(n,y));
		

	}
	public static int fac(int n,int ans)
	{   
	     if(n==0)//Base condition
	     {
	      return ans;//n=0=>ans=120
	      }
	      return fac(n-1,ans*n);//hypothesis
	      // n=5=>fact(4,1*5)
	      //n=4=>fact(3,5*4)
	      //n=3=>fact(2,20*3)
	      //n=2=>fact(1,60*2)
	      //n=1=>fact(0,120*1)
}
}
