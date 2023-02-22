package Assignment11thdev_arrays;

import java.util.Scanner;

public class productofarrayexceptself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[] arr=new long[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextLong();
		long [] ans=productexceptself(arr);
		for(int i=0;i<arr.length;i++)
		System.out.print(ans[i]+" ");
	}
	public static long [] productexceptself(long []arr)
	{   int n=arr.length;
		long[] left=new long[n];
	left[0]=1;
	for(int i=1;i<left.length;i++)
	{
		left[i]=left[i-1]*arr[i-1];
	}
	long[] right=new long[n];

	right[n-1]=1;
	for(int i=n-2;i>=0;i--)
	{
		right[i]=right[i+1]*arr[i+1];
	}
	long product=1;
	for(int i=0;i<right.length;i++)
	{
		left[i]=left[i]*right[i];
	}
	return left;
	}
}
