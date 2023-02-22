package Assignment26thDec_2D_Array;

import java.util.Scanner;

import javacrux2022_lecture7_Datatype.For_loop;

public class Arrays_SpiralPrintClockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int M = sc.nextInt();
			int N = sc.nextInt();
			int[][] a = new int[M][N];
			for (int i = 0; i < M; i++)
				for (int j = 0; j < N; j++)
					a[i][j] = sc.nextInt();
			spiralPrintclockwise2darray(a);
		}

		public static void spiralPrintclockwise2darray(int[][] a) {
			int minr=0,minc=0,maxr=a.length-1,maxc=a[0].length-1,count=0,te=a.length*a[0].length;
			while(count<te) {
			for (int i = minc; i <= maxc&&count<te; i++) {
				System.out.print(a[minr][i]+", ");count++;
			}minr++;
			for (int i = minr; i <= maxr&&count<te; i++) {
				System.out.print(a[i][maxc]+", ");count++;

			}maxc--;
			for (int i = maxc; i >= minc&&count<te; i--) {
				System.out.print(a[maxr][i]+", ");count++;

			}maxr--;
			for (int i = maxr; i >= minr&&count<te; i--) {
				System.out.print(a[i][minc]+", ");count++;

			}minc++;
			}
			System.out.print("END");
				
	}

}
