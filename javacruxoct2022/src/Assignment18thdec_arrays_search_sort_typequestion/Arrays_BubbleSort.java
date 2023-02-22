package Assignment18thdec_arrays_search_sort_typequestion;
import java .util.*;
public class Arrays_BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			long[] arr=new long[n];
			for(int i=0;i<arr.length;i++)
				arr[i]=sc.nextLong();
	            long a[]=bubblesort(arr);
	            for(int i=0;i<arr.length;i++)
	System.out.println(a[i]);
	    }
	public static long[] bubblesort(long[] arr)
	{ long temp=0;
	    for(int i=1;i<arr.length;i++)
	    {    
	        for(int j=0;j<arr.length-1;j++)
	         { 
	             if(arr[j]>arr[j+1])
	             { temp=arr[j];
	             arr[j]=arr[j+1];
	             arr[j+1]=temp;
	             }

	         }
	    }return arr;

	    }
	}