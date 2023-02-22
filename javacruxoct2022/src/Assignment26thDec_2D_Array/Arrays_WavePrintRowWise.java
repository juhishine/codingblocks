package Assignment26thDec_2D_Array;
import java.util.*;

public class Arrays_WavePrintRowWise {
/*
 Take as input a two-d array. Wave print it row-wise.

Input Format
Two integers M(row) and N(column) and further M * N integers(2-d array numbers).

Constraints
Both M and N are between 1 to 10.

Output Format
All M * N integers are seperated by commas with 'END' written in the end(as shown in example).

Sample Input
4 4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
Sample Output
11, 12, 13, 14, 24, 23, 22, 21, 31, 32, 33, 34, 44, 43, 42, 41, END
11, 12, 13, 14, 24, 23, 22, 21, 31, 32, 33, 34, 44, 43, 42, 41, END
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] a = new int[row][col];
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				a[i][j] = sc.nextInt();
		printrowwise2darray(a);
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
	public static void printrowwise2darray(int[][] a)
	{
		for (int row = 0; row < a.length; row++) {
			if(row%2==0)
			{
				for(int col=0;col<a[0].length;col++)
				{
					System.out.print(a[row][col]+","+" ");
				}
			}
			else
			{for(int col=a[0].length-1;col>=0;col--)
				System.out.print(a[row][col]+","+" ");
			}
				
		}

        System.out.print("END");
	}

}
