package Assignment11thdev_arrays;

import java.util.Scanner;

public class Array_reverseanarray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		int[] arrays=reversearray(arr);
		for(int i=0;i<arrays.length;i++)
			System.out.print(arrays[i]+" ");
	}
	public static int[] reversearray(int []arr)
	{
		int[] array=new int[arr.length];
		for(int i=arr.length-1;i>=0;i--)
		{
			array[arr.length-i-1]=arr[i];
		}
		return array;
	}
}


