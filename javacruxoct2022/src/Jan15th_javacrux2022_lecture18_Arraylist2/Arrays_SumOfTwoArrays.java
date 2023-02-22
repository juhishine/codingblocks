package Jan15th_javacrux2022_lecture18_Arraylist2;
import java.util.*;

import java.util.ArrayList;

public class Arrays_SumOfTwoArrays {
	/*
	 Take as input N, the size of array. Take N more inputs and store that in an array. Take as input M, the 
	 size of second array and take M more inputs and store that in second array. Write a function that returns
	  the sum of two arrays. Print the value returned.

Input Format
Constraints
Length of Array should be between 1 and 1000.

Output Format
Sample Input
4
1 0 2 9
5
3 4 5 6 7
Sample Output
3, 5, 5, 9, 6, END
Explanation
Sum of [1, 0, 2, 9] and [3, 4, 5, 6, 7] is [3, 5, 5, 9, 6] and the first digit represents carry over , if any 
(0 here ) .

{...} */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[] arr1=new int[N];
		int[] arr2=new int[M];
		for(int i=0;i<N;i++)
		arr1[i]=sc.nextInt();
		for (int j = 0; j < M; j++) {
			arr2[j]=sc.nextInt();

		}
//		int[] arr1= {1,0,2,9};
//		int[] arr2= {3,4,5,6,7};
		SumOfTwoArray(arr1,arr2);	
	}
	public static void SumOfTwoArray(int[] arr1,int[] arr2)
	{
		int i=arr1.length-1;int j=arr2.length-1;int sum=0,carry=0;
		ArrayList<Integer> list=new ArrayList<>();
		while(i>=0&& j>=0)
		{
			sum=arr1[i]+arr2[j];
			sum=sum+carry;
		list.add(sum%10);
		carry=sum/10;
		i--;j--;
		}
		while(i>=0)
		{
			sum=arr1[i]+carry;
		list.add(sum%10);
		carry=sum/10;
		i--;
		}
		while(j>=0)
		{
		sum=arr2[j]+carry;
		list.add(sum%10);
		carry=sum/10;
		j--;
		}
		//System.out.print(list);
		if(carry!=0)
		{list.add(carry);}
		Collections.reverse(list);
		for (int k = 0; k < list.size(); k++) {
			System.out.print(list.get(k)+",");
		}
		System.out.println("END");
		
	}
	

}
