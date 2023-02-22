package Assignment_31stjan_bitmasking_and_recursion;

import java.util.Scanner;

public class Uniquenumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 We are given an array containg n numbers. All the numbers are present thrice except for one number which is only present once. Find the unique number. Only use - bitwise operators, and no extra space.

Input Format
First line contains the number n. Second line contains n space separated number.

Constraints
N < 10^5

Output Format
Output a single line containing the unique number

Sample Input
7
1 1 1 2 2 2 3
Sample Output
3
Explanation
3 is present only once
*/
		//each bit will give three times contribution ,so will take %3
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] ar=new int[n];
for(int i=0;i<n;i++)
ar[i]=sc.nextInt();
System.out.println(uniqueNumber3(ar));

	}
	public static int uniqueNumber3(int[] nums)
	{
		 int ans=0;
	        for(int i=0;i<32;i++)
	        {
	        
	        int odd=0;
	        for(int j=0;j<nums.length;j++)
	        {
	            if(((nums[j]>>i)&1)!=0)
	            {
	                odd++;
	            }

	        }
	        if(odd%3==1)
	        {
	            ans+=(1<<i);
	        }
	        } 
	      
	        return ans;
	    }
//public static int uniqueNumber3(int[] nums)
//{
//	int[] cnt=new int[64];
//	for(int i=0;i<64;i++)
//		cnt[i]=0;
//	for (int j = 0; j < nums.length; j++) {
//		int i=0;
//		int no=nums[i];
//		while(no>0)
//		{
//			cnt[i]+=(no&1);
//			i++;
//			no=no>>1;
//		}
//		
//	}
//	int p=1;
//	int ans=0;
//	for (int i = 0; i < cnt.length; i++) {
//		cnt[i]%=3;
//		ans+=cnt[i]*p;
//		p=p<<1;
//	}
//	return ans;
//	}

	}
	