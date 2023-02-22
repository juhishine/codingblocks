package Jan28th_Lecture21_Recursion;

public class factorial_headrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(fac(n));
	}
	public static int fac(int n)
	{   
		if(n==0)
		{
		return 1;
		}
		return n*fac(n-1);
	}

}
