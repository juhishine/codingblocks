package Jan29_lecture22_recursion2;

public class IsPowerofThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=18;
		System.out.println(isPowerOfThree(n));
	}
	public static boolean isPowerOfThree(int n)
	{
		if(n==0)
	        return false;
	        if(n==1)
	        return true;
	        return (n%3==0) && isPowerOfThree(n/3);
	}

}
