package Assignment18thdec_arrays_search_sort_typequestion;

import java.util.Scanner;

public class sortinginlineartime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Given an array having n elements representing balls of various colours like red, white or blue, sort
		  them in-place so that balls of the same colour are adjacent, with the colours in the order red, 
		  white and blue.
To represent the colour red, white, and blue we will use the integers 0, 1, and 2 respectively.
Note:You are not suppose to use the sort function for this problem.

Input Format
First line contains integer n as size of array. Next n lines contains a single integer as element of array.

Constraints
None

Output Format
Print the balls in order so that balls of same colour are adjacent.

Sample Input
6
2 0 2 1 1 0
Sample Output
0 0 1 1 2 2 

		 * */
		//O(n+k)
		Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	   int arr[]=new int[N];
	   for(int i=0;i<arr.length;i++)
		   arr[i]=sc.nextInt();
      int a[]=sort_lineartime(arr);
      for(int i=0;i<a.length;i++)
    	  System.out.print(a[i]+" ");
	}
	public static int[] sort_lineartime(int[] arr)
	{ 
//     int x=0;int y=0;int n=arr.length;
//     for(int i=0;i<arr.length;i++)
//     {
//    	 if(arr[i]==0)x++;
//    	 else if(arr[i]==1)y++;
//     }
//     for(int i=0;i<n;i++)
//     {
//    	 if(i<n-(x+y))
//    		 arr[i]=0;
//    	 else if(i<(n-y))
//    		 arr[i]=1;
//     	 else
//     		 arr[i]=2;
//  
//       }   return arr;
//     
//		
//		if(arr.length==0 || arr.length==1)
//            return 0;
		//https://online.codingblocks.com/app/player/256854/content/257091/14603/lecture(2.43.09)
        int start=0;
        int end=arr.length-1;
        int index=0;
        while(index<=end&&start<end){ //gutch national flag algorithm
            if(arr[index]==0)
            {   arr[index]=arr[start];
                arr[start]=0;
                start++;
                index++;
            }
            else if(arr[index]==2)
            {
                arr[index]=arr[end];
                arr[end]=2;
                end--;
            }
            else
                index++;
        }
        return arr;
            
    }}
