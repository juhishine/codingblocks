package leetcode_array;

import java.util.Scanner;

public class Medianoftwosortedarray_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();//nums1
//		int m=sc.nextInt();//nums2
		int[] nums1= {1,2};//
		int[] nums2= {3,4};//13//10
		
//		for(int i=0;i<nums1.length;i++)
//			nums1[i]=sc.nextInt();
//		for(int i=0;i<nums2.length;i++)
//			nums2[i]=sc.nextInt();
		double a=median(nums1,nums2);
			System.out.println(a+" ");
	}
public static double median(int[] nums1,int[] nums2)
{  int m=nums1.length;
int n=nums2.length;
int i=0,j=0,k=0;
/* int low,high;
if(m>n)
{
    low=0;high=m;}
else
{
    low=0;high=n;}
  while(low<=high)
  {
      int cut1=(low+high)/2;
       int cut2=(int)(m+n+1)/2-cut1;
  int left1=(cut1==0)?Integer.MIN_VALUE:nums1[cut1-1];
  int left2=(cut2==0)?Integer.MIN_VALUE:nums2[cut2-1]; // this line show runtime error
  int right1=(cut1==m)?Integer.MAX_VALUE:nums1[cut1]; 
  int right2=(cut2==n)?Integer.MAX_VALUE:nums2[cut2];
  if(left1<=right2&&left2<=right1)
  { if((m+n)%2==0)
    {return (Math.max(left1,left2)+Math.min(right1,right2))/2.0;}
    else
    {return(Math.max(left1,left2));}
  }
  if(left1>right2)
 { high=cut1-1;}
  else
   {low=cut1+1;
   }
  }
  return 0.0;
  */
  int finalArray[]=new int[n+m];
  while(i<m && j<n) {
if(nums1[i]<nums2[j]) {
    finalArray[k++] = nums1[i++];
}
else {
    finalArray[k++]= nums2[j++];
}
}
if(i<m) {
while(i<m) 
    finalArray[k++] = nums1[i++];
}
if(j<n) {
while(j<n)
    finalArray[k++] = nums2[j++];
}
n = n+m;
if(n%2==1) 
return finalArray[((n+1)/2)-1];
else return ((double)finalArray[(n/2)-1]+(double)finalArray[(n/2)])/2.0;
}
}