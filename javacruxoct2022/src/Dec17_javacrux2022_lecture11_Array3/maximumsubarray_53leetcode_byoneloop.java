package Dec17_javacrux2022_lecture11_Array3;

public class maximumsubarray_53leetcode_byoneloop {
//kadane's algorithm
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(subarray(arr));

	}

	public static int subarray(int[] arr) {
		int sum = 0;
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			ans = Math.max(ans, sum);
			//System.out.println(ans+" "+sum);
			if (sum < 0) {
				sum = 0;
			}

		}
		return ans;
	}

}
