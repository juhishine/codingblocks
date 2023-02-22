package Assignment8thjan_stringques_andbinarysearchques;

import java.util.Scanner;

public class Strings_Count_Palindromic_Substrings {
	/*
	 * Take as input S, a string. Write a program that gives the count of substrings
	 * of this string which are palindromes and Print the ans.
	 * 
	 * Input Format Single line input containing a string
	 * 
	 * Constraints Length of string is between 1 to 1000.
	 * 
	 * Output Format Integer output showing the number of palindromic substrings.
	 * 
	 * Sample Input abc Sample Output 3 Explanation For the given sample case , the
	 * palindromic substrings of the string abc are "a","b" and "c". So, the ans is
	 * 3.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		String s1 = sc.next();
//		String_count(s1);
//	}
//
//	public static void String_count(String s1)
//	{     int ccount=1;int count=1;
//		for(int k=0;k<s1.length()-1;k++)//for ab input 0<3,1<3,2<3
//	   {  
//	   for(int m=k+1;m<s1.length();m++)//1<3,2<3
//         {
//	       String s=s1.substring(k,m);//
//	       if(palindrome(s)==true)
//	        { count++;}
//	   }
//        }
//		System.out.println(count);
//	}
//		
//
//	public static boolean palindrome(String s1) {
//		int i = 0;
//		int j = s1.length() - 1;
//		while (i < j)// two pointer approach
//		{
//			if (s1.charAt(i) != s1.charAt(j)) {
//				return false;
//			}
//			i++;
//			j--;
//		}
//		return true;
//	}
//}
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = 0;
        for(int i=0;i<s.length();i++){
            int odd = count(i-1, i+1, s) + 1;//-1,1,s//0,2,s
            int even = count(i-1, i, s);//-1,1,s//0,1,s
            ans += odd + even;
        }
        System.out.println(ans);
    }
    public static int count(int start, int end, String s){
        int ans = 0;
        while(start >= 0 && end < s.length()){  //0>=0&&2<3//0>=0&&1<2
            if(s.charAt(start) != s.charAt(end)){
                break;
            }
            start--;//0
            end++;//3
            ans++;
        }
        return ans;
    }
}