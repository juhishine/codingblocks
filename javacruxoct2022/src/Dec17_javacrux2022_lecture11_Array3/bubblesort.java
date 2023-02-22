package Dec17_javacrux2022_lecture11_Array3;

import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		int[] a=sort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.println(a[i]+" ");
	}
	public static int[] sort(int[] arr)
	{
		int temp=0;
for(int i=0;i<arr.length;i++)
{ 
	for(int j=0;j<arr.length-i-1;j++) 
	{
	 if(arr[j]>arr[j+1])
		    {
		     temp=arr[j];
		    arr[j]=arr[j+1];
		    arr[j+1]=temp;}
     //System.out.println(arr[j+1]+ " "+arr[j]);
	}
}
return arr;
}
}