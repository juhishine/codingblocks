package Dec25_javacrux2022_lecture14_2Darray2;
import java.util.*;
public class Search_in_matrix_240leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1,4,7,11,15},
				{ 2,5,8,12,19 }, 
				{ 3,6,9,16,22},
			  {10,13,14,17,24},
			  { 18,21,23,26,30}};
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(search_matrix_target(arr,n));
		// System.out.println(sum+" ");
	}

	public static boolean search_matrix_target(int[][] arr,int target) { //staircase_search
		int row=0;int col=arr[0].length-1;
		while(row<arr.length||col<0) {
				if(arr[row][col]==target)
					{return true;
				     }
				else if(arr[row][col]>target)
					{col--;}
				else
				   row++;	
				}
		return false;
	}
}
