package Dec18_javacrux2022_lecture12_Binarysearchinanarray;

import java.util.Scanner;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		int[] arr= {2,3,4,6,8,13};
//		int[] arr=new int[n];
//		for(int i=0;i<arr.length;i++)
//			arr[i]=sc.nextInt();
		//int element =sc.nextInt();
		int item=13;
			System.out.println(binarysearch(arr,item));
	}
	public static int binarysearch(int[] arr,int element)
	{
		//Arrays.sort(arr);
		int mid;
		int low=0;int high=arr.length-1;
		while(low<=high)
		{
		 mid=(low+high)/2;
		if(arr[mid]==element)
          return mid;		
		else if(arr[mid]<element)
			{low=mid+1;}
		else if(arr[mid]>element)
			high=mid-1;
		}
		return -1;
	}
	}


