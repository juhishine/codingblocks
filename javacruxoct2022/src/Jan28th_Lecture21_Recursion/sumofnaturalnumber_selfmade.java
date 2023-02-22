package Jan28th_Lecture21_Recursion;

public class sumofnaturalnumber_selfmade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(sumofnaturalnumber(n));
	}
	public static int sumofnaturalnumber(int n)
	{
       if(n==0)
    	   return 0;
       return n+sumofnaturalnumber(n-1);
       //5+s(4)+4+s(3)+3+s(2)+2+s(1)+1+s(0)
	}

}
