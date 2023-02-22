package Dec11_javacrux2022_lecture10_Array2;

public class Rain_Water_Trapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,0,2,1,0,1,3,2,1,2,1};// for sample 31251869
		System.out.println(Rainwater(arr));

	}
	public static int Rainwater(int []arr)
	{
		int[] left=new int[arr.length];
		left[0]=arr[0];
		for(int i=1;i<left.length;i++)
		{
			left[i]=Math.max(left[i-1],arr[i]);
			//3355889
		}
		int[] right=new int[arr.length];
		int n=arr.length;
		right[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--)
		{
			right[i]=Math.max(right[i+1],arr[i]);
			//9999999
		}
		int sum=0;
		for(int i=0;i<right.length;i++)
		{
			sum=sum+Math.min(left[i], right[i])-arr[i];
		}
		return sum;
	}

}
