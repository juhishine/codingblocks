package leetcode_array;

public class twosum_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,4,5,6};
		int target=3;
		int[] a=twosum(nums,target);
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
	}
		public static int[] twosum(int[] nums,int target)
		{ 
			int i=0;
	        int j=nums.length-1;
	        int[] a=new int[2];
	        while(i<j)
	        {
	            if(nums[i]+nums[j]==target)//num[0]+nums[1]==3
	            {
	            for(int k=i;k<=j;k++)
	            	{ a[k]=i;}
	            }
	            else if(nums[i]+nums[j]>target)
	            {j--;}
	            else 
	            {i++;}
	        }
	        return a; 
	    }
	  }
