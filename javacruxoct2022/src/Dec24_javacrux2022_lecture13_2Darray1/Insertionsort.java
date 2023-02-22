package Dec24_javacrux2022_lecture13_2Darray1;

import java.util.Scanner;

public class Insertionsort {

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
		int temp=0;
for(int i=1;i<arr.length;i++)
{ temp=arr[i];
int j=i-1;
while(j>=0&&arr[j]>temp) // in while first index will be check then second condition will be checked
{  arr[j+1]=arr[j];
j--;
	}arr[j+1]=temp; 
}
return arr;
}
}