package Assignment18thdec_arrays_search_sort_typequestion;
import java.util.*;

public class Arrays_Insertionsort {
	//time complexity o(n^2)

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	   int arr[]=new int[N];
	   for(int i=0;i<arr.length;i++)
		   arr[i]=sc.nextInt();
      int a[]=insertionsort(arr,N);
      for(int i=0;i<a.length;i++)
    	  System.out.println(a[i]);
	}
	public static int[] insertionsort(int[] arr,int N)
	{    int j;
		for(int i=1;i<N;i++)
			{ int temp=arr[i];
			for( j=i-1;j>=0&&arr[j]>temp;j--)	//or j=i-1;while(j>=0&&a[j]>temp){arr[j+1]=arr[j];j--;}
			{  
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
			}
		return arr;
				
    }
}