package Assignment18thdec_arrays_search_sort_typequestion;

import java.util.Scanner;

public class Maximumxircularsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 You are provided n numbers (both +ve and -ve). Numbers are arranged in a circular form. You need to find the maximum sum of consecutive numbers.

Input Format
First line contains integer t which is number of test case.
For each test case, it contains an integer n which is the size of array and next line contains n space separated integers denoting the elements of the array.

Constraints
1<=t<=100
1<=n<=1000
|Ai| <= 10000

Output Format
Print the maximum circular sum for each testcase in a new line.

Sample Input
1
7
8 -8 9 -9 10 -11 12
Sample Output
22
Explanation
Maximum Circular Sum = 22 (12 + 8 - 8 + 9 - 9 + 10)
 */ //https://www.youtube.com/watch?v=kd0-hUwISDo (16.17)
		//https://online.codingblocks.com/app/player/256854/content/257091/14603/lecture(02:07:59)
		Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();int n;
	    while(t-->0)
	    {
	     n=sc.nextInt();
	    int[] arr=new int[n];
	    for(int j=0;j<arr.length;j++)
			   arr[j]=sc.nextInt();
	     //int a=max_circularsum(arr);
    	  System.out.print(max_circularsum(arr));
	    }
	}
	public static int max_circularsum(int[] arr)
	{int linearsum=kadane_algo(arr);
	//System.out.println(linearsum);//12
	int sumall=0;
	for(int i=0;i<arr.length;i++)
		 sumall=sumall+arr[i];
	//System.out.println(sumall);//11
	for(int i=0;i<arr.length;i++)
		{
		arr[i]=-1*arr[i];
		}
	   int inverted_kadane=kadane_algo(arr);
	int circularsum =sumall+inverted_kadane; //22
	//System.out.println(circularsum);
	return Math.max(circularsum, linearsum);
	
	}
	public static int kadane_algo(int[] arr)
	{ int sum = 0;  //-8,8,-9,9,-10,11,-12
	int ans = Integer.MIN_VALUE;
	for (int i = 0; i < arr.length; i++) 
	{
		sum += arr[i]; //-1
		ans = Math.max(ans, sum);//11
		//System.out.println(ans+" "+sum);
		if (sum < 0) {
			sum = 0;
		}

	}return ans;
	}

}
