package Dec17_javacrux2022_lecture11_Array3;

import java.util.Scanner;

public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		int a[]=sort(arr);
		for(int i=0;i<arr.length;i++)
	           System.out.println(a[i]+" ");
	}
	public static int[] sort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			{int min=i;
			for(int j=i+1;j<arr.length;j++)
			{ if(arr[min]>arr[j])
				min=j;
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			}
	return arr;	
	}

}
