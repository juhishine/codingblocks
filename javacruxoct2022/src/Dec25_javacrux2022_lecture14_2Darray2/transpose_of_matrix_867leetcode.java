package Dec25_javacrux2022_lecture14_2Darray2;

public class transpose_of_matrix_867leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		transpose(arr);
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}

	public static void transpose(int[][] arr) {
		int temp;
		for (int row = 0; row < arr.length; row++) {
			for (int col = row + 1; col < arr[0].length; col++) {
				temp = arr[row][col];
				arr[row][col] = arr[col][row];
				arr[col][row] = temp;

			}
		}
	}
}
