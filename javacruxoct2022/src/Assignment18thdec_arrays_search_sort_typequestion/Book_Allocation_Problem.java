package Assignment18thdec_arrays_search_sort_typequestion;

import java.util.Arrays;
import java.util.Scanner;

public class Book_Allocation_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();

		  for(int i =0;i<t;i++) {
		  int n = sc.nextInt();
		  int k =sc.nextInt();
		   
		  long[] books=new long[n];
		  for(int j=0;j<n;j++)
		  {
		  	books[j]=sc.nextLong();
		  }

		    System.out.println(binarySearch(books, n, k));
		  }
		}

		public static long binarySearch(long books[], int n, int k) {
		long ans = 0, low = 0, high = 0;
		long sum = 0;
		for (int i = 0; i < n; i++) {
		high += books[i];

		  }
		  while (low <= high) {
		  	long mid = (high + low) / 2;
		  	if (isValid(books, n, k, mid)) {
		  		ans = mid;
		  		high = mid - 1;
		  	} else {
		  		low = mid + 1;
		  	}
		  }
		  return ans;
		}

		public static boolean isValid(long books[], int n, int k, long mid) {
		int students = 1;
		long current_page = 0;
		for (int i = 0; i < books.length; i++) {
		if (books[i] > mid) {

		  		return false;
		  	}
		  	if (current_page + books[i] <=mid) {
		          current_page += books[i];
		  		//current_page = books[i];
		  		//students++;
		  		
		  	} else {
		          students++;
		          current_page=0;
		  		  current_page += books[i];
		          if (students > k) {
		  			return false;
		  		}

		  	}
		  }
		  return true;

		}
		}