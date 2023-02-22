package Assignment27thnov_function;
import java.util.*;

public class bostonnumbers {
/*
 A Boston number is a composite number, the sum of whose digits is the sum of the digits of its prime factors obtained as a result of prime factorization (excluding 1 ). The first few such numbers are 4,22 ,27 ,58 ,85 ,94 and 121 . For example, 378 = 2 × 3 × 3 × 3 × 7 is a Boston number since 3 + 7 + 8 = 2 + 3 + 3 + 3 + 7. Write a program to check whether a given integer is a Boston number.

Input Format
There will be only one line of input:N , the number which needs to be checked.

Constraints
1 < N < 2,147,483,647 (max value of an integer of the size of 4 bytes)

Output Format
1 if the number is a Boston number. 0 if the number is a not Boston number.

Sample Input
378
Sample Output

 */
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
//int n;
//Scanner sc=new Scanner(System.in);
//if(n>1&&n<2147483647)
//	boolean b=bostonNumber(n);
//if(b==true)System.out.println("1");
//else System.out.println("0");
//	}
//	public static boolean bostonNumber(int num)
//	{  int fact=1;int rem=0,sum=0;
//	for(int i=1;i<=num;i++)//1 to 4
//		fact=fact*i; //1*1=1,1*2=2,
//	while(num>0)
//	{
//		rem=num%10;
//		sum=rem+sum;
//		num=num/10;
//	}
//	if(fact==sum)
//		return true ;
//	else 
//		return false;
//	}
//
//}

		public static int primeFactors(long n) 
	    {   int sum= 0 ;
	        while (n%2==0) 
	        { 
	            sum+=2; 
	            n /= 2; 
	        } 
	  
	        for (int i = 3; i <= Math.sqrt(n); i+= 2) 
	        { 
	            while (n%i == 0) 
	            { 
	            	sum+=i;
	            	n /= i; 
	            } 
	        } 
	   
	        if (n > 2) 
	            sum+=n ;  
	        
	        return sum ;
	    } 

		public static void main(String[] args) {
	       Scanner scn = new Scanner(System.in) ; 
	       long N= scn.nextLong();
	       int sod=0;
	       long temp=N ;//temp=378
	       while(temp!=0)
	       {
	           sod+=temp%10;//sod=18
	           temp/=10;//37
	       }
	       for(int i=2;i*i<=N;i++)//2 to 378
	           if(N%i==0)
	           {
	               int count=0;
	               while(N%i==0)
	               {
	                   N/=i;
	                   count++;
	               }
	               int sum=0;
	                temp=i;
	               while(temp!=0)
	               {
	                   sum+=temp%10;
	                   temp/=10;
	               }
	               sod-=sum*count;
	           }
	       if(N!=1)
	       {
	           int sum=0;
	               temp=N;
	               while(temp!=0)
	               {
	                   sum+=temp%10;
	                   temp/=10;
	               }
	           sod-=sum;
	       }
	       if(sod==0)
	       System.out.println("1");
	       else 
	    	   System.out.println("0");
	       }
		}

