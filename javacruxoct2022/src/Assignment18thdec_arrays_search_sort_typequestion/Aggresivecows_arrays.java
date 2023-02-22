package Assignment18thdec_arrays_search_sort_typequestion;

import java.util.Arrays;
import java.util.Scanner;

public class Aggresivecows_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	    int C=sc.nextInt();
	    int[] arr=new int[N];
	    for(int j=0;j<arr.length;j++)
			   arr[j]=sc.nextInt();
	    Arrays.sort(arr);
		System.out.println(LargestminDistance(arr,C));
	}
	public static int LargestminDistance(int [] arr,int C)
	{
		int low=arr[0];int high=arr.length-1;
		int ans=0;
		while(low<=high) 
		{
			int mid=(low+high)/2;
		if(isitpossible(arr,C,mid)==true) 
		{
			ans=mid;
			low=mid+1;
		}
		else
		{high=mid-1;
		}
		}return ans;
	}

public static boolean isitpossible(int[] arr,int C,int mid)
{
		int cow=1;
		int pos=arr[0];
		for(int i=1;i<arr.length;i++)
			{
			if(arr[i]-pos>=mid)
			{
				pos=arr[i];
				cow++;
			}
			if(cow==C)
			{
				return true;
			}
			} return false;
		
	
}
}
