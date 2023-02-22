package Assignment26thDec_2D_Array;

import java.util.Scanner;

public class ABooleanMatrix {
	/*
	 Given a boolean matrix mat[M][N] of size M X N, modify it such that if a matrix cell mat[i][j] is 1 
	 (or true) then make all the cells of ith row and jth column as 1.

Input Format
First line contains two integers m and n denoting the dimensions of the matrix Next m lines contains n integers
 each.

Constraints
1 <= m*n <= 106

Output Format
Print the modified matrix

Sample Input
2 2
1 0
0 0
Sample Output
1 1
1 0
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int[][] a = new int[M][N];
		for (int i = 0; i < M; i++)
			for (int j = 0; j < N; j++)
				a[i][j] = sc.nextInt();
	   if1print1inrowandcol(a);
	}

	public static void  if1print1inrowandcol(int[][] a) {
		int[][] temp=a;
//		for (int row = 0; row < a.length; row++) {	
//				for (int col = 0; col <a[0].length; col++) {
//                  if(temp[row][col]==1)
//                  {   for(int i=0;i<a.length;i++)
//                	  {a[i][col]=1;
//                	  }
//                      for(int j=0;j<a[0].length;j++)
//                    	  {a[row][j]=1;}
//                  }
//			}
//		}
//			for (int row = 0; row < a.length; row++) {
//				for (int col = 0; col <a[0].length; col++) {
//					System.out.print(a[row][col]+" ");
//				}	System.out.println();
//	}
		int i,j;
		int[] r=new int[a.length];
		int[] c= new int[a[0].length];

		for (int row = 0; row < a.length; row++) {	
		for (int col = 0; col <a[0].length; col++) {
			if(a[row][col]==1)
				{r[row]=1;
			     c[col]=1;
				}
		}
}
		for ( i = 0; i < a.length; i++) {	
			for ( j = 0; j <a[0].length; j++) {
		if(r[i]==1||c[j]==1)
			a[i][j]=1;
		
	}
	}
		for (int l = 0; l < a.length; l++) {	
			for (int m = 0; m <a[0].length; m++) {
				System.out.print(a[l][m]);
			}System.out.println();
	}
	}
	}
