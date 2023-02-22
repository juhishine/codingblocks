package Jan21st_Lectur19th_BitMasking;

public class Singlenumber2_threetimesandsingletimenumbers_leetcode137 {
	//done myself

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {2,2,3,2};
		System.out.println(Unique_number(num));
	}
	public static int Unique_number(int[] nums){
		 int ans=0;
	        for(int i=0;i<32;i++)
	        {
	        
	        int odd=0;
	        for(int j=0;j<nums.length;j++)
	        {
	            if(((nums[j]>>i)&1)!=0)
	            {
	                odd++;
	            }

	        }
	        if(odd%3==1)
	        {
	            ans+=(1<<i);
	        }
	        } 
	      
	        return ans;
	    }
	}