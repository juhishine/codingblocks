package Assignment18thdec_arrays_search_sort_typequestion;

import java.util.Iterator;
import java.util.Scanner;
/*
You are provided two sorted arrays. You need to find the maximum length of bitonic subsequence. You need to find the sum of the maximum sum path to reach from beginning of any array to end of any of the two arrays. You can switch from one array to another array only at common elements.

Input Format
First line contains integer t which is number of test case. For each test case, it contains two integers n and m which is the size of arrays and next two lines contains n and m space separated integers respectively.

Constraints
1<=t<=100 1<=n,m<=100000

Output Format
Print the maximum path.

Sample Input
1
8 8
2 3 7 10 12 15 30 34
1 5 7 8 10 15 16 19
Sample Output
122
Explanation
122 is sum of 1, 5, 7, 8, 10, 12, 15, 30, 34
 */

public class Maximumsumpathintwo_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] a1 = new int[n];
			int[] a2 = new int[m];
			for (int i = 0; i < n; i++)
				a1[i] = sc.nextInt();
			for (int j = 0; j < m; j++)
				a2[j] = sc.nextInt();
			int sum = max_path_twoarrays(a1, a2);
			System.out.println(sum);
		}
	}

	public static int max_path_twoarrays(int[] a1, int[] a2) {
		int sum = 0;
		int i = 0, j = 0, p = 0, q = 0;int sum1=0,sum2=0;
		while (i < a1.length && j < a2.length) {
			if (a1[i] < a2[j]) {
				sum1 =sum1+a1[i];
				i++;
			}else if (a1[i] > a2[j]) {
				sum2 =sum2+ a2[j];
				j++;
			}
			else {
//				for(int k = p; k <i; k++)
//					sum1 =sum1+a1[k];
//				for(int l = q; l <j; l++)
//					sum2 =sum2+ a2[l];
				sum=sum + Math.max(sum1,sum2)+a1[i];
				//System.out.println(sum);
				sum1=0;sum2=0;
				i++;
				j++;	
			}
		}
			while(i<a1.length)
					{sum1=sum1+a1[i];i++;
			        } 
			while(j<a2.length){
				    sum2=sum1+a2[j];j++;
					}
			sum=sum+Math.max(sum1, sum2);
		return sum;
	}//closing function 
}//closing full body 

//https://online.codingblocks.com/app/player/256854/content/257091/14603/lecture (37.59)
//https://www.geeksforgeeks.org/maximum-sum-path-across-two-arrays/
// https://www.youtube.com/watch?v=k8RPBED5KtA
