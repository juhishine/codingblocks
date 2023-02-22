package Dec18_javacrux2022_lecture12_Binarysearchinanarray;

import java.util.Scanner;

public class kthrootbybinarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();           //87
		int k=sc.nextInt(); //3
		System.out.println(kthroot(n,k));
	}
	public static int kthroot(int n,int k)
	{
		int ans=0;   //3
		int mid;
		int low=1;int high=n;
		while(low<=high)
		{
		 mid=(low+high)/2;
				
		 if(Math.pow(mid, k)<n)
			{ans =mid;low=mid+1;}
		else 
			high=mid-1;
		}
		return ans;//4
	
}
	}




		
