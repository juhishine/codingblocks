package Assignment_31stjan_bitmasking_and_recursion;
import java.util.*;

public class UniqueNumbertwo {
		
		     public static void main(String args[]) {
		         // Your Code Here
		        Scanner sc=new Scanner(System.in);
		        int n=sc.nextInt();
		        int[] arr=new int[n];
		         for(int i=0;i<n;i++)
		         {arr[i]=sc.nextInt();}
		 		uniqueNumber2(arr);

		 	}
		 	public static void uniqueNumber2(int[] arr)
		 	{  
		 		int ans=0;
		         for(int i=0;i<arr.length;i++)
		         ans^=arr[i];
		         int mask=ans&(~(ans-1));
		         int a=0;
		         for(int i=0;i<arr.length;i++)
		         {
		             if((arr[i]&mask)!=0)
		               {a^=arr[i];}
		         }
		        int b=ans^a;
		 System.out.println(b+" "+a);	
		 }
		 }
