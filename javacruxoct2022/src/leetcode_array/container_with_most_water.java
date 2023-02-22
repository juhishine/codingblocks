package leetcode_array;

public class container_with_most_water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height= {1,8,6,2,5,4,8,3,7};
		System.out.println(container_mostwater(height));
	}
	public static int container_mostwater(int[] height)
		{int start = 0;
        int end = height.length-1;
        int result = 0;
        while (start < end) {
            int currMax = (end - start) * Math.min(height[start],height[end]);
            if (height[start] < height[end]){
                start++;
            }
            else
            {
                end--;
            }
            result = Math.max(result,currMax);
        }
        return result;
	}
}


