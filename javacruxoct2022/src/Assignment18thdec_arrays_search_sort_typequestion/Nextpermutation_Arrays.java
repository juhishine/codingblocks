package Assignment18thdec_arrays_search_sort_typequestion;

import java.util.Scanner;

public class Nextpermutation_Arrays {
	/* 
	 Given an array Arr[], Treat each element of the array as the digit and whole array as the number. 
	 Implement the next permutation, which rearranges numbers into the numerically next greater permutation 
	 of numbers.

If such arrangement is not possible, it must be rearranged as the lowest possible order ie, sorted in an 
ascending order.

Note: The replacement must be in-place, do not allocate extra memory.

Input Format
The First Line contains the Number of test cases T.
Next Line contains an Integer N, number of digits of the number.
Next Line contains N-space separated integers which are elements of the array 'Arr'.

Constraints
1 <= T <= 100
1 <= N <= 1000
0 <= Ai <= 9

Output Format
Print the Next Permutation for each number separated by a new Line.

Sample Input
2
3
1 2 3 
3
3 2 1

Sample Output
1 3 2
1 2 3

Explanation
Possible permutations for {1,2,3} are {1,2,3} , {1,3,2} , {2,1,3} , {2,3,1}, {3,1,2} and {3,2,1}. {1,3,2} is 
the immediate next 
permutation after {1,2,3}.
For the second testcase , {3,2,1} is the last configuration so we print the first permutation as its next 
permutation.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://www.youtube.com/watch?v=LuLCLgMElus(9.01)
		Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0) {
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    for(int j=0;j<arr.length;j++)
			   arr[j]=sc.nextInt(); 
	    nextpermutation(arr);
	    for(int i=0;i<arr.length;i++)
	     {System.out.print(arr[i]+" ");
	     }System.out.println();
         }
	}
	    public static void nextpermutation(int[] A)
	    {   int p=0;
	        int i;
	        int j;

	        for (i = A.length - 2; i >= 0; i--) {
	            if (A[i] < A[i + 1])
	            	p=i;
	                break;
	        }
        int q=0;
	            for (j = A.length - 1; j > p; j--) {
	                if (A[p] < A[j])
	                	{q=j;
	                    break;}
	                }
	            if(p==0&&q==0)
            	{reverse(A,0,A.length-1);
                return;
                }
	            int temp = A[p];
		        A[p] = A[q];
		        A[q] = temp;
	        reverse(A, p + 1, A.length - 1);
	    }

	    public static void reverse(int[] A, int i, int j) { //two pointer approach
	        while (i < j) {
             int temp=A[i];
             A[i]=A[j];
             A[j]=temp;
             i++;
             j--;
             }
	    }

//	    private void swap(int[] A, int i, int j){
//	        int temp = A[i];
//	        A[i] = A[j];
//	        A[j] = temp;
//	    }
	}