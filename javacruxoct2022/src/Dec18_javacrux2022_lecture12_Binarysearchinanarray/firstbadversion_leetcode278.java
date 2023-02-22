package Dec18_javacrux2022_lecture12_Binarysearchinanarray;
import java.util.*;

public class firstbadversion_leetcode278{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[]= {0,1,2,3,4,5};
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 System.out.println(isBadversion(n,arr));
	}
public static bool isBadversion(int n, int[] arr)
{  
	 public int firstBadVersion(int n) {
		    int low =1;
		        int high =n;
			int ans=0;
			while(low<=high)
			{
		        int mid=low +(high-low)/2;
		     if(isBadVersion(mid)==true)
		     {
		         ans=mid;
		         high=mid-1;
		     }
		     else
		     {low=mid-1;
		     }   
		    }return ans;
		    }
}