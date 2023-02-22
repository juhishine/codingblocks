package Assignment_31stjan_bitmasking_and_recursion;
import java.util.*;
public class UniqueNumber2 {
	/*
	 We are given an array containg n numbers. All the numbers are present twice except for two numbers which are present only once. Find the unique numbers in linear time without using any extra space. ( Hint - Use Bitwise )

Input Format
First line contains the number n. Second line contains n space separated number.

Constraints
n < 10^5

Output Format
Output a single line containing the unique numbers separated by space

Sample Input
4
3 1 2 1
011 010 =001 xor 010 
Sample Output
2 3
Explanation
Smaller number comes before larger number
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  int[] arr=new int[n];
		  for(int i=0;i<n;i++)
		  arr[i]=sc.nextInt();
				System.out.println(uniqueNumber2(arr));

			}
			public static int uniqueNumber2(int[] arr)
			{  
				int ans=0;
		        for(int i=0;i<32;i++)
		        {
		        
		        int odd=0;
		        for(int j=0;j<arr.length;j++)
		        {
		            if(((arr[j]>>i)&1)!=0)
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
		}