package test1;
import java.util.*;
import java.util.Arrays;

public class Singleinengineeringcollege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int [] arr= new int[N];
		for(int i=0;i<arr.length;i++)
		{arr[i]=sc.nextInt();}
		int x=sc.nextInt();
		Arrays.sort(arr);
		System.out.println(Maximumheight(arr,x));
	}
	public static int Maximumheight(int [] arr,int x)
	{
		int low=0;int high=arr[arr.length-1];
		int ans=0;
		while(low<=high) 
		{
			int mid=(low+high)/2;
		if(isitpossible(arr,x,mid)==true) 
		{
			ans=mid;
			low=mid+1;
		}
		else
		{
			high=mid-1;
		}
		}
        return ans;
	}

public static boolean isitpossible(int[] arr,int x,int mid)
{
       int temp=0;		

		for(int i=0;i<arr.length;i++)
			{
            if(arr[i]>mid)
            {
			temp=temp+(arr[i]-mid);
            }
			if(temp>x)
			{
				return true;
			}
			} 
            return false;
}
}