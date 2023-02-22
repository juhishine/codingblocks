package leetcode_array;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,4,5,6,7};int k=3;
		int[] temp=new int[nums.length];
//	      int j=0;
//	      for(int i=nums.length-k;i<nums.length;i++)
//	      { temp[j]=nums[i];
//	        j++;
//	        System.out.println(temp[i]);
//	      }
//	      
//	      for(int m=0;m<nums.length-k;m++)
//	      {temp[j]=nums[m];
//	      System.out.println(temp[j]);}
//
//	      for(int n=0;n<nums.length;n++)
//	      nums[n]=temp[n];
//
//	      for(int i=0;i<nums.length;i++)
//	      System.out.print(nums[i]);
//	    }
//	    
//	}
k=k%nums.length;
reverse(nums,0,nums.length-1);
reverse(nums,0,k-1);
reverse(nums,k,nums.length-1);
for(int i=0;i<nums.length;i++)
	System.out.print(nums[i]);
}
public static void reverse(int[]  nums,int start,int end)
{ int temp;
    while(start<end)
    {
        temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        start++;
        end--;
    }
}

}