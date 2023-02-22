package Assignment26thDec_2D_Array;
import java.util.*;

public class Arrays_WaveprintColumnWise {
	/*
	 Take as input a two-d array. Wave print it column-wise.

Input Format
Two integers M(row) and N(colomn) and further M * N integers(2-d array numbers).

Constraints
Both M and N are between 1 to 10.

Output Format
All M * N integers seperated by commas with 'END' wriiten in the end(as shown in example).

Sample Input
4 4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
Sample Output
11, 21, 31, 41, 42, 32, 22, 12, 13, 23, 33, 43, 44, 34, 24, 14, END*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] a = new int[row][col];
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				a[i][j] = sc.nextInt();
		printcolwise2darray(a);
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

	public static void printcolwise2darray(int[][] a) {
		for (int col = 0; col <a[0].length; col++) {
			if (col % 2 == 0) {
				for (int row = 0; row < a.length; row++) {
					System.out.print(a[row][col] + "," + " ");
				}
			} else {
				for (int row = a.length - 1; row >= 0; row--) {
					System.out.print(a[row][col] + "," + " ");
				}
			}
			

		}System.out.print("END");
	}
}