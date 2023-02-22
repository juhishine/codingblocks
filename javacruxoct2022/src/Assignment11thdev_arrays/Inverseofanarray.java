package Assignment11thdev_arrays;

import java.util.Scanner;

public class Inverseofanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		inversearray(arr,arr.length);
	}
	public static void inversearray(int[] arr,int n)
	{         int arr2[]=new int[n];
	 for(int i=0;i<n;i++)
		 arr2[arr[i]]=i;
	 for(int i=0;i<arr2.length;i++)
	 {
		 System.out.print(arr2[i]+" ");
	 }
	}
}
