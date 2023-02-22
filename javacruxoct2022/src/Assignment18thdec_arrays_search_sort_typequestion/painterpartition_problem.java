package Assignment18thdec_arrays_search_sort_typequestion;
import java.util.*;

public class painterpartition_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int K=sc.nextInt();//no of painters
		int N=sc.nextInt();//no of boards
		int[] arr=new int[N];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int a=mintime(arr,K,N);
		System.out.println(a);
}
	public static int mintime(int[] arr,int K,int N)
		{ int low;int max=0;
        for(int i=0;i<arr.length;i++)
        {if(max<arr[i])
         {max=arr[i];}
        }
low=max;
         int high=0;int ans=0;
		for(int i=1;i<arr.length;i++)
		 {high=high+arr[i];}
		 while(low<=high)
		 {
		     int mid=(low+high)/2;
		     if(isitpossible(arr,K,N,mid)==true)
		     {
		      ans=mid;
		      high=mid-1;
		     }
		     else
		     {
		     low=mid+1;
		     }
		 }
		return ans;
		}
		public static boolean isitpossible(int[] board,int K,int N,long mid)
		{
//			{ 1 <= K <= 10
//					// 1 <= N <= 10  //k
//					// 1<= Length of each Board <= 10^8 ,arr
	     int count = 1;
        int time = 0;
        for(int i=0;i<board.length;i++){
            if(time+board[i] <= mid){
                time += board[i];
            }else{
                count++;
                if(count > K || board[i] > mid){
                    return false;
                }
                time = board[i];
            }
            if(count > K){
                return false;
            }
        }
           return true;
		}
}
