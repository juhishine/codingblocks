package Jan28th_Lecture21_Recursion;

public class sumofdigits_selfmade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=253;
		System.out.println(sum(n));
	}
	public static int sum(int n)
	{  
		if(n==0)
			return 0;
		else 
			{
		    return sum(n/10)+n%10;
		    }
	}
}
