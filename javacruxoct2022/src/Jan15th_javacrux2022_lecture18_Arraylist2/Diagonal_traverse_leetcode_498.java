package Jan15th_javacrux2022_lecture18_Arraylist2;

import java.util.ArrayList;
import java.util.Collections;

public class Diagonal_traverse_leetcode_498 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat= {{1,2,3},{4,5,6},{7,8,9}};
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();	
		}
		Traverse(mat);
	}
	public static void Traverse(int[][] arr)
	{ 		
		int n=arr.length;
	    int m=arr[0].length;int idx=0;
	    int[] ans=new int[n*m];
		for (int d= 0; d < n+m-1; d++){
			int r=0,c=0;
			if(d<m) 
			{
				c=d;
			}
			else {
				r=d-m+1;
				c=m-1;
			}
			ArrayList<Integer> list=new ArrayList<>();//list ka size 0 tha

			while(r<n&&c>=0){
				//System.out.print(arr[r][c]+" ");
				list.add(arr[r][c]);
				r++;
				c--;
				
			}
			if(d%2==0)
			{Collections.reverse(list);
			}
			for (int i = 0; i < list.size(); i++) {
				ans[idx]=list.get(i);
				idx++;
				
			}
			//System.out.println(list);
		
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
			
		}
	}
	

}
