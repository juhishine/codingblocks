package Assignment26thDec_2D_Array;
import java.util.*;

public class PrintUpperTriangularMatrix {
	/*
	 You are given a 2-D array and you have to print the elements of upper triangle as it is and zero in the 
	 lower triangle.

Input Format
First line of the input contains single integers n denoting number of rows and number of columns. Take next 
n*n elements as input of the matrix.

Constraints
None

Output Format
The upper half of array with digits and lower as 0.

Sample Input
3
1 2 3
4 5 6
7 8 9
Sample Output
1 2 3
0 5 6
0 0 9
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				a[i][j] = sc.nextInt();
		displayuppertriaglein2darray(a);
	}

	public static void displayuppertriaglein2darray(int[][] a) {
			for (int row = 0; row < a.length; row++) {
				for (int col = 0; col <a[0].length; col++) {
					if(col>=row)
				{System.out.print(a[row][col]+" ");}
					else
					{System.out.print("0"+" ");}

			}
			System.out.println();
		}
	}

}
