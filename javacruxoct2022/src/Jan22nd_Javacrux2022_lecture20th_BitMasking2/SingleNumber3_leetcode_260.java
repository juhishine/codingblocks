package Jan22nd_Javacrux2022_lecture20th_BitMasking2;

public class SingleNumber3_leetcode_260 {
	/*
	 * grouping banao ..jaise ki differnt grp me dono number aa jaye */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,7,8,9,13,8,7,9,3,13};
		Single_number(arr);

	}
	public static void Single_number(int[] arr) {
		// TODO Auto-generated method stub
		int ans=0;
		for (int i = 0; i < arr.length; i++) {
			ans^=arr[i];
		}
		int mask=(ans&(~(ans-1)));
		//System.out.println(ans);
		int a=0;
		for (int i = 0; i < arr.length; i++) {
			if((mask&arr[i])!=0)
			{a=a^arr[i];
			}
		}
		int b=a^ans;
		System.out.println(a+" "+b);
			
		}

	}


