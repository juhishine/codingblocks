package feb4_javacrux2022_lecture23_Recursion3;

public class Kthsymbolingrammar_779_leetcodeques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n=3, k=4;
   int temp=solve(n,k);
   System.out.println(temp);
	}
	
	public static int solve(int n,int k)
	{  
		if(n==1)
			return 0;
//		else if(n==2&&k==1)
//			return 1;
		int mid=(int)(Math.pow(2, n-1))/2;//mid=2
		//int prev=solve(n,k);
		if(k<=mid)
		{
			return solve(n-1,k);
		}
		else if(k>mid)
		{
			return negate(solve(n-1,k-mid));
		}
		return -1;
	}
	public static int negate(int input)
	{
		return input==1?0:1;
	}

}
/*
 n=1 ,k=1, 0
 n=2, k=1,2, 01
 n=3, k=1,2,3,4 0110
 n=4 k=1,2,3,4,5,6,7,8 01101001*/
