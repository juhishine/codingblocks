package Assignment18thdec_arrays_search_sort_typequestion;

import java.util.Scanner;

public class Squareofasortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[] arr=new long[n];
	   for(int i=0;i<arr.length;i++)
		   arr[i]=sc.nextLong();
      long a[]=sq_sort_array(arr,n);
      for(int i=0;i<a.length;i++)
    	  System.out.print(a[i]+" ");
	}
	public static long[] sq_sort_array(long[] arr,int n)
	{ long a[]=new long[n];long temp;
	  for(int i=0;i<arr.length;i++)
		 a[i] =(long)Math.pow(arr[i],2);
	  int j;
	  for(int i=0;i<arr.length-1;i++)
		  { int min=i;
		  for(j=i+1 ;j<arr.length;j++)
		  { if(a[min]>a[j])
			  min=j;  
		  } if(min!=i)
		     {temp=a[i];
		     a[i]=a[min];
		     a[min]=temp;
		      }
		  }
	  return a;	
	}

}