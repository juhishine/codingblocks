package Assignment8thjan_stringques_andbinarysearchques;

import java.util.Arrays;
import java.util.Scanner;

public class FormBiggestNumber {
	/*
	 You are provided an array of numbers. You need to arrange them in a way that yields the 
	 largest value.

Input Format
First line contains integer t which is number of test case.
For each test case, you are given a single integer n in the first line which is the size of 
array A[] and next
 line contains n space separated integers denoting the elements of the array A .

Constraints
1<=t<=100

1<=m<=100

1<=A[i]<=10^5

Output Format
Print the largest value.

Sample Input
1
4
54 546 548 60
Sample Output
6054854654
Explanation
Upon rearranging the elements of the array , 6054854654 is the largest possible number that 
can be generated.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{   int n=sc.nextInt();
		    int[] arr=new int[n];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt(); // input of int array 
			}
			 System.out.println(largestpossiblenumber(arr));
		}
	}
//	public static String largestpossiblenumber(int[] arr)
//	{
//	    String[] s=new String[arr.length];// creating a string array 
//	    for(int i=0;i<arr.length;i++)
//	    {s[i]=arr[i]+"";// converting integer array to string array 
//	    }
//	    Arrays.sort(s,(a,b)->{   // sorting number 54,60,546,548
//	    	String order1=a+b; //54546  //54860
//	    	String order2=b+a;//54654   //60548
//	    	return order1.compareTo(order2);  //54654 //60548 =>6054854654 ==> 60,548,546,54
//	    });
//	    String temp="";            //empty string created 
//	    for (int i = arr.length-1; i >=0; i--) {
//	    	temp+=s[i];          // string array added in empty string temp
//			
//		}
//	    return temp;
   // }
	public static String largestpossiblenumber(int[] ar)
	{   String[] arr=new String[ar.length]; //created string array to store int array values
	  for (int i = 0; i < ar.length; i++) {
		arr[i]=ar[i]+"";  // stored values in string array
	   }
		String ans="";  // for final answer to store in String 
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				String temp =arr[i]+arr[j]; //two array values added 
				long a=Long.parseLong(temp); //string is converted in long 
				String temp1=arr[j]+arr[i];//two array values added 
				long b=Long.parseLong(temp1); //string is converted in long 
				if(b>a)
					{
					swap(arr,i,j); // swap the value
					}	
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			ans+=arr[i];// added value of array in string
		}
		return ans;
	}
	public static void swap(String[] arr, int i, int j)
	{
		String temp=arr[i];  //swapped the position of two values in array 
		arr[i]=arr[j];
		arr[j]=temp;
	}
}

