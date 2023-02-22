package leetcode_string_8thjan;

import java.util.Scanner;

public class Palindromic_substring_count_647 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		System.out.println(string_count_palindrome_substrings(s1));
	}
	public static int string_count_palindrome_substrings(String s)
	{
		int n=s.length();
       if(n==0||n==1)
       {return n;
       }
       int cnt=0;
       if(n%2!=0)
       {
       for(int i=0;i<n;i++)
       {
           int j=n/2;int k=j;
           while(j>=0 && k<n && s.charAt(j)==s.charAt(k))
           {j--;k++;
           cnt++;}
       }
       }
       else if(n%2==0)
       {
                  for(int i=0;i<n;i++)
                   {
                   int j=n/2-1;int k=j+1;
                    while(j>=0 && k<n && s.charAt(j)==s.charAt(k))
                     {j--;k++;cnt++;
                     
                     }
                    if(n<5)
                    {cnt++;}
                   }
       }
      return cnt;
}
}

       