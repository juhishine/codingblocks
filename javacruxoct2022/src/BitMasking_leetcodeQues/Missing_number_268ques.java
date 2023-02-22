package BitMasking_leetcodeQues;

public class Missing_number_268ques {
/*
asked in 17lk , 45lakh ,35lakh lpa 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {9,6,4,2,3,5,7,0,1};
		  int ans=0;
	        int n=nums.length;
	        for(int i=0;i<nums.length;i++)
	        ans=ans^nums[i];
	        for(int i=n;i>=0;i--)
	        ans=ans^i;// here two times xor of same type number after two loops 
	        //, different number will be returned as ans.
            System.out.println(ans);
}
	}