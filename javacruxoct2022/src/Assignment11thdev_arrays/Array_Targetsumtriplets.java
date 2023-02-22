package Assignment11thdev_arrays;
import java.util.*;

public class Array_Targetsumtriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		int target=sc.nextInt();
		targetsumpairs(arr,target);
		
	}
	public static void targetsumpairs(int []arr,int target)
	{  
        Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			int l=i+1;
			int r=arr.length-1;
			while(l<r) {
				int sum=arr[i]+arr[l]+arr[r];
				if(sum==target)
					{System.out.println(arr[i]+" and "+arr[l]+" and "+arr[r]);l++;r--;}
				else if(sum>target)r--;
				else l++;
				
			}
		}
			
		}
}
            
	
	


