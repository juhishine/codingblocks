package Test;
import java.util.*;

public class Sortnumberaccordingtoonesinthem {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        sortByBinaryCount(arr);
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
/*  1 2 3 4 5 6 7 8 
 * 0001 0010 0011 0100 0101 0110 0111 1000 
 * 0001 0010 0100 1000 0011 0101 0110 0111 
 * 1     2     4   8   3     5     6   7
 */
	/*public static int countOnes(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }*/
	/*
	public static void sortByBinaryCount(int[] arr) {
        Integer[] arrWrapper = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrWrapper[i] = arr[i];
        }
        Arrays.sort(arrWrapper, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int countA = countOnes(a);
                int countB = countOnes(b);
                if (countA != countB) {
                    return countA - countB;
                } else {
                    return a - b;
                }
            }
        });
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrWrapper[i];
        }
    }
    */
	/*
	 We first create a new Integer array arrWrapper that has the same length as the input int array arr.
We copy each element from arr to arrWrapper.
We use Arrays.sort method to sort the arrWrapper array. The Comparator used in the sorting compares two integers a and b based on the number of 1's in their binary representation.
If the count of 1's in a is not equal to the count of 1's in b, we return the difference of the counts. This will sort the integers based on the count of 1's in their binary representation in ascending order.
If the count of 1's in a is equal to the count of 1's in b, we return the difference between a and b. This will sort the integers with the same count of 1's in their binary representation based on their actual value in ascending order.
After the arrWrapper array is sorted, we copy its elements back to the original arr array.
I hope this explanation helps!




*/
	public static void sortByBinaryCount(int[] arr) {
	    Integer[] arrWrapper = new Integer[arr.length];
	    for (int i = 0; i < arr.length; i++) {
	        arrWrapper[i] = arr[i];
	    }
	    Arrays.sort(arrWrapper, (a, b) -> Integer.bitCount(a) == Integer.bitCount(b) ? a - b : Integer.bitCount(a) - Integer.bitCount(b));
	    for (int i = 0; i < arr.length; i++) {
	        arr[i] = arrWrapper[i];
	    }
	}
	/*This version of the method uses lambda expressions to create the Comparator for sorting the 
	 * arrWrapper array.

	The Arrays.sort method takes the arrWrapper array and a lambda expression as arguments. The lambda 
	expression compares two integers a and b based on the number of 1's in their binary representation.

	If the count of 1's in a is not equal to the count of 1's in b, the lambda expression returns the 
	difference of the counts. This will sort the integers based on the count of 1's in their binary 
	representation in ascending order.

	If the count of 1's in a is equal to the count of 1's in b, the lambda expression returns the difference between a and b. This will sort
	 the integers with the same count of 1's in their binary representation based on their actual value in ascending order.

	After the arrWrapper array is sorted, the method copies its elements back to the original arr array.
	*/
}
