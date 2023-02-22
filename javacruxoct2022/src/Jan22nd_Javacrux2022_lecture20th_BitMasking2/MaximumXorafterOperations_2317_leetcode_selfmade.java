package Jan22nd_Javacrux2022_lecture20th_BitMasking2;

public class MaximumXorafterOperations_2317_leetcode_selfmade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {3,2,4,6};
		int res=0;
        for(int i=0;i<nums.length;i++)
        res|=nums[i];
        System.out.println(res);
}
}