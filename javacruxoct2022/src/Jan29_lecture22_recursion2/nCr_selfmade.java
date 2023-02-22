package Jan29_lecture22_recursion2;
import java.util.*;

public class nCr_selfmade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
int n,r;
n=sc.nextInt();
r=sc.nextInt();
System.out.println(nCr(n,r));
	}
//	public static int nCr(int n,int r)
//	{//time taken 3n, o(n)
//		int t1,t2,t3;
//	  t1=fact(n);
//	  t2=fact(r);
//	  t3=fact(n-r);
//     return t1/(t2*t3);
//	}
//	public static int fact(int m)
//	{
//		if(m==0||m==1)
//			return 1;
//		return m*fact(m-1);
//	}
//}
public static int nCr(int n, int r)
{   
//pascal triangle , n-1Cr-1+n-1Cr=nCr
	if(n==r||r==0)
	return 1;
	return nCr(n-1,r-1)+nCr(n-1,r);
	}
}
