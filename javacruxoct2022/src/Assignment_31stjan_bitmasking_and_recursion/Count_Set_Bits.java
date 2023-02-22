package Assignment_31stjan_bitmasking_and_recursion;
import java.util.*;

public class Count_Set_Bits {
	/*
	 count number of 1s in binary representation of an integer

Input Format
Input N = Number of Test Cases, followed by N numbers

Constraints
Output Format
Number of Set Bits in each number each in a new line

Sample Input
3
5
4
15
Sample Output
2
1
4
Explanation
Convert Binary to Decimal first and then count number of 1's present in all digits.
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        for(int i=0;i<n;i++)
	        {int arr=sc.nextInt();
	        System.out.println(countsetbit(arr));
	        }
		}
		public static int countsetbit(int n){
			int count=0;
		// 	for(int i=0;i<n;i++)
		// 	{
		// 	while(n>0)// or (n!=0)
		// 	{
		// 	n=(n&(n-1));
		// 	count++;
		// 	}
		//    }
	    while(n!=0)
	    {
	        if((n&1)!=0)
	        {count++;}
	        n>>=1;
	    }		//for(int j=0;j<n.length;j++)
			return count;
	}
	}
