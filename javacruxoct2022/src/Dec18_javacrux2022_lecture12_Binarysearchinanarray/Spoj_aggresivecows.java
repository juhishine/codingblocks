package Dec18_javacrux2022_lecture12_Binarysearchinanarray;

import java.util.Arrays;
//nlogn complexity

public class Spoj_aggresivecows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] stall= {1,2,8,4,9};
		Arrays.sort(stall);
		int noc=3;
		System.out.println(LargestminDistance(stall,noc));
	}
	public static int LargestminDistance(int [] stall,int noc)
	{
		int low=stall[0];int high=stall.length-1;
		int ans=0;
		while(low<=high) 
		{
			int mid=(low+high)/2;
		if(isitpossible(stall,noc,mid)==true) 
		{
			ans=mid;
			low=mid+1;
		}
		else
		{high=mid-1;
		}
		}return ans;
	}

public static boolean isitpossible(int[] stall,int noc,int mid)
{
		int cow=1;
		int pos=stall[0];
		for(int i=1;i<stall.length;i++)
			{
			if(stall[i]-pos>=mid)
			{
				pos=stall[i];
				cow++;
			}
			if(cow==noc)
			{
				return true;
			}
			} return false;
		
	
}
}
