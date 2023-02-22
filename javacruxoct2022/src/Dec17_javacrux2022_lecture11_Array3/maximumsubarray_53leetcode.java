package Dec17_javacrux2022_lecture11_Array3;

import java.util.Scanner;

public class maximumsubarray_53leetcode {
//brute force se better 
	//carins
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int[] arr=new int[n];
//		for(int i=0;i<arr.length;i++)
//			arr[i]=sc.nextInt();
		int[] arr= {2,-13,5,-1,7};
		System.out.println(subarray(arr));

	}
	public static int subarray(int []arr)
	{
		int ans=Integer.MIN_VALUE;//2^31
		for(int i=0;i<arr.length;i++)
		{   int sum=0;
			for(int j=i;j<arr.length;j++)
			{
				 sum=sum+arr[j];
				ans=Math.max(ans,sum);
			}
				
		}
		return ans;
	}
}


