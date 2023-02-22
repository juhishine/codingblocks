package Dec25_javacrux2022_lecture14_2Darray2;

import java.util.Iterator;

public class spiral_sum_2darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4},
				{ 6, 7, 8, 9 }, 
				{ 11, 12, 13, 14}};
				//{ 16, 17, 18, 19, 20 } };
		spiral_sum(arr);
		// System.out.println(sum+" ");
	}

	public static void spiral_sum(int[][] arr) { 
		int minc=0;int minr=0;
		int maxr=arr.length-1;
		int maxc=arr[0].length-1;
		int te=arr.length*arr[0].length;
		int count=0;
		//while(minr>maxr && minc>maxc)
		while(count<te)
		{
			for (int i = minc; i <= maxc&&count<te; i++) {
				System.out.print(arr[minr][i]+" ");
				count++;	
		}
		minr++;
		for(int i=minr;i<=maxr&&count<te;i++) {
			System.out.print(arr[i][maxc]+" ");
			count++;
		}
		maxc--;
		for (int i = maxc; i >= minc&&count<te; i--) {
			System.out.print(arr[maxr][i]+" ");
			count++;
		}
		maxr--;
		for (int i = maxr; i >=minr&&count<te; i--) {
			System.out.print(arr[i][minc]+" ");
			count++;
		}
		
		minc++;	
	}
	// return sum;
	}
}