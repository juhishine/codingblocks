package Assignment11thdev_arrays;

import java.util.Scanner;

public class Runningsumofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		for(int i=1;i<arr.length;i++)//0,1,2
		{ arr[i]+=arr[i-1];//arr[1]=+arr[0],arr[2]=+arr[1]
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
	}

}
