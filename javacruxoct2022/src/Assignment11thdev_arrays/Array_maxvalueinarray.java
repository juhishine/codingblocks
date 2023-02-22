package Assignment11thdev_arrays;

import java.util.Scanner;

public class Array_maxvalueinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
			if(arr[i]>max)
				max=arr[i];
		System.out.println(max);
		
		

	}

}
