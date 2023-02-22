package Assignment8thjan_stringques_andbinarysearchques;

import java.util.Scanner;

public class PlayingwithGoodStrings {
	/*
	 A Good String is a string which contains only vowels (a,e,i,o,u) . Given a string S, print a single 
	 positive integer N where N is the length of the longest substring of S that is also a Good String.

Note: The time limit for this problem is 1 second, so you need to be clever in how you compute the substrings.

Input Format
A string 'S'

Constraints
Length of string < 10^5

Output Format
A single positive integer N, where N is the length of the longest sub-string of S that is also a Good String.

Sample Input
cbaeicde
Sample Output
3
Explanation
Longest good substring is "aei"*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
       int m=longestvowelsubstring(s);
       System.out.print(m);
	}
	public static int longestvowelsubstring(String str)
	{
		for (int i = 0; i < str.length();i++) {
			int count = 0, res = 0;
	        char ch = str.charAt(i);
	            // Increment current count 
	            // if s[i] is vowel 
	            if (isVowel(ch)) 
	            {
	            count++;   
	            }
	            else
	            {
	                // check previous value 
	                // is greater then or not
	                res = Math.max(res, count);
	                count = 0;
	            }
	        }
	         
	    return Math.max(res, count);
	    }
	

public static boolean isVowel(char c)
    {
        if(c == 'a' || c == 'e' || c == 'i'
                 || c == 'o' || c == 'u')
        	{return true;}
        return false;
    }
 
}
