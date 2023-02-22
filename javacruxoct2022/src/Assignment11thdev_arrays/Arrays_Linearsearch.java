package Assignment11thdev_arrays;

import java.util.Scanner;

public class Arrays_Linearsearch {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		int k=sc.nextInt();
		int num=lsearch(arr,k);
			System.out.print(num+" ");
	}
	public static int lsearch(int[] a,int m)
	{ for(int i=0;i<a.length-1;i++)
		{  if(a[i]== m)
			return i;
			
		}
		return -1;
	}
}
