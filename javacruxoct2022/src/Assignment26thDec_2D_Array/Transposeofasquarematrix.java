package Assignment26thDec_2D_Array;

import java.util.Iterator;
import java.util.Scanner;

public class Transposeofasquarematrix {
	/*
	 Given a square matrix, print its transpose.

Input Format
First line contains the N ,size of the square matrix. Next N lines contains N integers each denoting the
 elements of the matrix

Constraints
1 <= N <= 10^3

Output Format
Print N lines each containing N elements. These are the elements of the new matrix.

Sample Input
5
1 46 4 60 100 
28 52 97 80 59 
6 33 62 42 12 
57 31 56 89 47 
1 50 73 53 99 
Sample Output
1 28 6 57 1 
46 52 33 31 50 
4 97 62 56 73 
60 80 42 89 53 
100 59 12 47 99 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] a = new int[N][N];
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				a[i][j] = sc.nextInt();
		transpose2darray(a);
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

	public static void transpose2darray(int[][] a) {
     for (int row = 0; row < a.length; row++) {
	for (int col = row+1; col < a[0].length; col++) {
	 int temp=a[row][col];
	 a[row][col]=a[col][row];
	 a[col][row]=temp;
	}
	
}	
     for (int row = 0; row < a.length; row++) {
    		for (int col = 0; col < a[0].length; col++) {
    			System.out.print(a[row][col]+" ");
    		}System.out.println();
		}
	}
}
