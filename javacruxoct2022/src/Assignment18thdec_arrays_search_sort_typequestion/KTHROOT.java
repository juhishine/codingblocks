package Assignment18thdec_arrays_search_sort_typequestion;
import java.util.*;
public class KTHROOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 int t=sc.nextInt();
               for(int i=0;i<t;i++)
               	           {  long n=sc.nextLong();
			                     long k=sc.nextLong();
	                             System.out.println(kthroot(n,k));}
	                          }
	public static long kthroot(long n,long k)
	{ 			
         long low=0;long ans=0;
         long high=n;
         while(low<=high)
         {  
             long mid=low+(high-low)/2;
             if(n<(Math.pow(mid,k)))
             { high=mid-1;
             }
             else if(n>=(Math.pow(mid,k)))
           	  {ans=mid;
           	  low=mid+1;}
         }return ans;	
         
	    }
	}