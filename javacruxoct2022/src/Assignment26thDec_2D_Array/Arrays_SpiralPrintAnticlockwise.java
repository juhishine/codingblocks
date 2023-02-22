package Assignment26thDec_2D_Array;

import java.util.Scanner;

public class Arrays_SpiralPrintAnticlockwise {
	/*
	 Take as input a 2-d array. Print the 2-D array in spiral form anti-clockwise.

Input Format
Two integers M(row) and N(colomn) and further M * N integers(2-d array numbers).

Constraints
Both M and N are between 1 to 10.

Output Format
All M * N integers separated by commas with 'END' written in the end(as shown in example).

Sample Input
4 4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
Sample Output
11, 21, 31, 41, 42, 43, 44, 34, 24, 14, 13, 12, 22, 32, 33, 23, END
Explanation
For spiral level anti-clockwise traversal, Go for first column-> last row ->last column-> first row and then 
do the same traversal for the remaining matrix .
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
		spiralPrintAnticlockwise2darray(a);
	}

	public static void spiralPrintAnticlockwise2darray(int[][] a) {
		int minr=0,maxr=a.length-1,minc=0,maxc=a[0].length-1;int count=0;int te=a.length*a[0].length;
		while(count<te)
		{
	  for(int row=minr;row<=maxr&&count<te;row++)
		  {System.out.print(a[row][minc]+", ");count++;
		  }
	  minc++;
		  
		  for(int col=minc;col<=maxc&&count<te;col++)
			  {System.out.print(a[maxr][col]+", ");count++;}
		  maxr--;
		  
			  
			  for(int row=maxr;row>=minr&&count<te;row--)
				  {System.out.print(a[row][maxc]+", ");count++;}
			  maxc--;

				  
				  for(int col=maxc;col>=minc&&count<te;col--)
					  {System.out.print(a[minr][col]+", ");count++;}
				  minr++;
		}		  
		System.out.print("END");
	}
	}
