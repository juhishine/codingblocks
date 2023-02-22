package Dec25_javacrux2022_lecture14_2Darray2;

import java.util.Scanner;

public class verticalwave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int m=sc.nextInt();
//		int[][] arr=new int[n][m];
		//int sum=vertical_wavesum(arr,n,m);
		int[][] arr = { { 1, 2, 3, 4, 5 },
				{ 6, 7, 8, 9, 10 }, 
				{ 11, 12, 13, 14, 15 }, 
				{ 16, 17, 18, 19, 20 } };
		vertical_wavesum_display(arr);
		// System.out.println(sum+" ");
	}

	public static void vertical_wavesum_display(int[][] arr) { // int sum=0;
		for (int col = 0; col < arr[0].length; col++) {
			if (col % 2 == 0) {
				for (int row = 0; row < arr.length; row++) {
					// sum=sum+arr[row][col];
					System.out.print(arr[row][col] + " ");
				}
			} else {

				for (int row = arr.length - 1; row >= 0; row--) {
					System.out.print(arr[row][col] + " ");
				}

			}
		}

		// return sum;
	}
}