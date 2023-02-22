package Assignment11thdev_arrays;

import java.util.Scanner;

public class Array_targetsumpairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		int target=sc.nextInt();
		targetsumpairs(arr,target);
		
	}
	public static void targetsumpairs(int []arr,int target)
	{  int sum=0;
//	  target =a[0]+a[1];
//	  target =a[0]+a[2];
//	  target =a[0]+a[3];.
//	  target =a[0]+a[4];
//	  target =a[1]+a[2];
//	  target =a[1]+a[3];.
//	  target =a[1]+a[4];
//	  target =a[2]+a[3];
//	  target =a[2]+a[4];
//	  target =a[3]+a[4];

	for(int i=0;i<arr.length;i++)
		for(int j=i+1;j<arr.length;j++)
            {sum=arr[i]+arr[j];
		if(target==sum)
			if(arr[i]<arr[j])
			System.out.println(arr[i]+" and "+arr[j]);
			else
			System.out.println(arr[j]+" and "+arr[i]);

		}
	}
	

}
