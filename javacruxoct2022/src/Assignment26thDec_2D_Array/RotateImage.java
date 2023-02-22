package Assignment26thDec_2D_Array;

import java.util.Scanner;

public class RotateImage {
	/*
	 Given a 2D array of size N x N. Rotate the array 90 degrees anti-clockwise.



Input Format
First line contains a single integer N. Next N lines contain N space separated integers.

Constraints
N < 1000

Output Format
Print N lines with N space separated integers of the rotated array.

Sample Input
4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
Sample Output
4 8 12 16 
3 7 11 15 
2 6 10 14 
1 5 9 13 
Explanation
Rotate the array 90 degrees anticlockwise.
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] a = new int[N][N];
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				a[i][j] = sc.nextInt();
		rotatematrix90degree_anticlockwise(a);
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

	public static void rotatematrix90degree_anticlockwise(int[][] a) {
		for (int col = a.length - 1; col >=0; col--) {
			for (int row = 0; row < a.length; row++) {
				System.out.print(a[row][col]+" ");
			}
			System.out.println();
		}
	}
}