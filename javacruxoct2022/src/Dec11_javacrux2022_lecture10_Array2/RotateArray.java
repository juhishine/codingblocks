package Dec11_javacrux2022_lecture10_Array2;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0,1,2,3,4};
		int k=3;
		Rotate(nums,k);
		for(int j=0;j<nums.length;j++)
			System.out.println(nums[j]);
		
	}
	public static void Rotate(int[] nums,int k)
	{int temp=0;
	for(int i=0;i<k;i++)
	}
    {
        for(int j=nums.length-2;j>0;j--)
        {   
        	temp=nums[j+1];//temp=nums[4]
        	nums[j+1]=nums[i];//nums[4]=nums[3]
        	nums[j]=temp;//nums[3]=4
        	
    }


	}

}
