package Jan28th_Lecture21_Recursion;

public class Power_headrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =2;
		int n = 9;
		System.out.println(pow(x,n));

	}
//	public static int pow(int x, int n)
//	{
//		if(n==0)
//	        {return 1;}
//	      
//	        return x*pow(x,n-1);
//	        
//	}
	public static int pow(int m,int n)
	{
		if(n==0)
			return 1;
		if(n%2==0)
			return pow(m*m,n/2);
		else
			return m*pow(m*m,(n-1)/2);
	}
	

}
