package Assignment18thdec_arrays_search_sort_typequestion;
import java.util.*;

public class Arrays_BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
            int m=sc.nextInt();
		int a=bubblesort(arr,m);
			System.out.println(a+" ");
	}
    public static int bubblesort(int[] arr,int m)
{   int low=0;int high=arr.length;int pos=-1;
      while(low<high)
       {
      int mid=low+(high-low)/2;
       if(arr[mid]==m)
      {pos=mid;
      return pos;
      }
     else if(arr[mid]>m)
     mid=high-1;
     else 
     mid=low+1;
     }
     return pos;
}
}