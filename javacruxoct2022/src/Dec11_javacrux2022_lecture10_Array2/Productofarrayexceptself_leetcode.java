package Dec11_javacrux2022_lecture10_Array2;

public class Productofarrayexceptself_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4};
		int [] ans=productexceptself(arr);
		for(int i=0;i<arr.length;i++)
		System.out.print(ans[i]+" ");
	}
	public static int [] productexceptself(int []arr)
	{   int n=arr.length;
		int[] left=new int[n];
	left[0]=1;
	for(int i=1;i<left.length;i++)
	{
		left[i]=left[i-1]*arr[i-1];
	}
	int[] right=new int[n];

	right[n-1]=1;
	for(int i=n-2;i>=0;i--)
	{
		right[i]=right[i+1]*arr[i+1];
	}
	int product=1;
	for(int i=0;i<right.length;i++)
	{
		left[i]=left[i]*right[i];
	}
	return left;
	}
}
