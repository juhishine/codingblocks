package Recursion_selfNote;

public class MatrixChainMultiplication_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//matrix tree banayenge, -1 store karenge , agar -1 nhi hai, to usme koi valid value hai , agar -1 hai , to valid value bana kar dalenge
int[][] t=new int[1001][1001];
mainset(t,-1,t.length);
solve(arr,0,size-1);
}
	public int solve(int[] arr,int i,int j)
	{
		if(i>=j)
			{return 0;}
		int mn=Integer.MAX_VALUE;
		if(arr[i][j]==-1)
			{return arr[i][j];}
		for (int k = i; k <=j; k++) {
			int temp_ans=solve(arr,i,k)+solve(arr,k+1,j)+arr[i-1]*arr[k]*arr[j];
			if(temp<mn)
				mn=temp;
		}
			 mn=arr[i][j];
			 return mn;
		
	}

}
