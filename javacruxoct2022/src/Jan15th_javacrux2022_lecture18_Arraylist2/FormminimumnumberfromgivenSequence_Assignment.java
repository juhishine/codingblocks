package Jan15th_javacrux2022_lecture18_Arraylist2;

import java.util.Arrays;
import java.util.Scanner;

public class FormminimumnumberfromgivenSequence_Assignment {
	/*
	 Given an array of patterns containing only I’s and D’s. I for increasing and D for decreasing. Devise an 
	 algorithm to print the minimum number following that pattern. Digits from 1-9 and digits can’t repeat.

Input Format
The First Line contains an Integer N, size of the array. Next Line contains N Strings separated by space.

Constraints
1 ≤ T ≤ 100 1 ≤ Length of String ≤ 8

Output Format
Print the minimum number for each String separated by a new Line.

Sample Input
4
D I DD II
Sample Output
21
12
321 
123
Explanation
For the Given sample case, For a Pattern of 'D' print a decreasing sequence which is 2 1.
Amazon question asked in 2021

leet code - 2375. Construct Smallest Number From DI String
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String pattern="";
		
	    for(int i=0;i<n;i++)
		{
		pattern=sc.next();
		System.out.println(min_number(pattern));
		}
	}
	public static String min_number(String pattern)
	{       
		String ans = "";
	        for (int i = 0; i <= pattern.length(); i++) {
	            ans = (i + 1) + "";
	            System.out.print(ans);
	        }
	        for (int i = 0; i < pattern.length(); i++) {
	            int j = i;
	            while (j >= 0 && pattern=="D") {
	                swap(ans, j, j + 1);
	                j--;
	            }
	        }
	        return ans;
	    }
	    
	    private static void swap(String arr, int i, int j) {
	        char temp = arr.charAt(i);
	        arr.charAt(i) = arr.charAt(j);
	        arr.charAt(j) = temp;
	    }
	}   
	   