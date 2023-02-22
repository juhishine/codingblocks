package Jan28th_Lecture21_Recursion;

public class Leetcode50_powerx_n_self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x =2;
		int n = 10;
		System.out.println(pow(x,n));

	}
	public static double pow(double x, int n)
	{
		if(n==0)
	        {return 1;}
	      
	        return x*pow(x,n-1);
	        
	}

}
