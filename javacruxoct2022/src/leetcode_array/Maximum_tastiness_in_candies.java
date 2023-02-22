package leetcode_array;

import java.util.Arrays;

public class Maximum_tastiness_in_candies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] price= {13,5,1,8,21,2};
		int k=3;
		Arrays.sort(price);
	    int lo = 0, hi = 1000_000_000;
	    while (lo < hi) {
	        int mid = lo + (hi - lo) / 2;
	        if (check(mid, price, k)) lo = mid + 1;
	        else hi = mid;
	    }
         System.out.println(lo-1);
}
	public static boolean check(int x, int[] price, int k) {
	    int last = price[0], count = 1, i = 1;
	    while (count < k && i < price.length) {
	        if (price[i] - last >= x) {
	            last = price[i]; count++;
	        }
	        i++;
	    }
	    return count == k;
	}
}


