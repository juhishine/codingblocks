package Assignment_31stjan_bitmasking_and_recursion;

import java.util.Scanner;

public class Recursion_nthTriangle {
	/*
	 * Take as input N, a number. Write a recursive function to find Nth triangle where 1st triangle is 1, 2nd triangle is 1 + 2 = 3, 3rd triangle is 1 + 2 + 3 = 6, so on and so forth. Print the value returned.

Input Format
Enter a number N

Constraints
None

Output Format
Display the Nth triangle

Sample Input
4
Sample Output
10*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(sum_nthtriangle(n));
	}
	public static int sum_nthtriangle(int n){
		if(n==0||n==1)
			return n;
		return sum_nthtriangle(n-1)+n;
}
}
        
    