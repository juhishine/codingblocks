package Assignment_31stjan_bitmasking_and_recursion;

import java.util.Scanner;

public class UniqueNumber1 {
	/*
	 * We are given an array containg n numbers. All the numbers are present twice except for one number which is only present once. Find the unique number without taking any extra spaces and in linear time. ( Hint - Use Bitwise )

Input Format
First line contains the number n. Second line contains n space separated number.

Constraints
n < 10^5

Output Format
Output a single line containing the unique number

Sample Input
7
1 1 2 2 3 3 4 
Sample Output
4
Explanation
4 is present only once*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] num= new int[n];
		for(int i=0;i<n;i++)
			num[i]=sc.nextInt();
		
		System.out.println(Unique_number1(num));
	}
	public static int Unique_number1(int[] nums){
		int res=0;

        for(int j=0;j<nums.length;j++)
        {
           res=res^nums[j];

        }
        return res;
     
}
}
        
    