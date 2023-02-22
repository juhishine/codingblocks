package Assignment11thdev_arrays;
import java.util.*;

public class Majorityelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
 Given an array of size n, find the majority element. The majority element is the element that appears more
  than n/2 times.

You may assume that the array is non-empty and the majority element always exist in the array.

Input Format
First line contains integer N (size of the array) followed by N more integers.

Constraints
Output Format
Majority Element of array

Sample Input
3
1 1 2
Sample Output
1
Explanation
Number of 1's in the array is more than 3/2 , Hence majority element is 1
Moore Voting Algorithm/Brute better optimal /leet code
*/
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<arr.length;i++)
	arr[i]=sc.nextInt();
int element =0;int count=0;
for(int i=0;i<arr.length;i++)
{
    if(count==0)
    	element=arr[i];
    if(arr[i]==element)
    	count++;
    else 
    	count--;
}
	System.out.println(element);
}
}
