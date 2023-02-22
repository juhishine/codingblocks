package Assignment18thdec_arrays_search_sort_typequestion;

import java.util.Scanner;

public class Arrays_selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	   int arr[]=new int[N];
	   for(int i=0;i<arr.length;i++)
		   arr[i]=sc.nextInt();
      int a[]=selectionsort(arr,N);
      for(int i=0;i<a.length;i++)
    	  System.out.print(a[i]+" ");
	}
	public static int[] selectionsort(int[] arr,int N)
	{ int temp;
		for(int i=0;i<N-1;i++)
			{ 
			int min=i;
			for(int j=i+1;j<N;j++)
			{  
				if(arr[min]>arr[j])
					{min=j;
			        }
			}
			if(min!=i)
			{ temp=arr[i];
			   arr[i]=arr[min];
			   arr[min]=temp;//arr.swap(arr[i],arr[min]);}
			}
			}return arr;
	}

}