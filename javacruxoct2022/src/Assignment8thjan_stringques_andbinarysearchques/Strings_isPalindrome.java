package Assignment8thjan_stringques_andbinarysearchques;
import java.util.*;

public class Strings_isPalindrome {
/*
 Take as input S, a string. Write a function that returns true if the string is a palindrome and false 
 otherwise. Print the value returned.

Input Format
String

Constraints
String length between 1 to 1000 characters

Output Format
Boolean

Sample Input
abba
Sample Output
true
Explanation
A string is said to be palindrome if reverse of the string is same as string. For example, “abba” is 
palindrome as it's reverse is "abba",
 but “abbc” is not palindrome as it's reverse is "cbba".*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.next();
System.out.println(ispalindrome(s));

	}
	public static boolean ispalindrome(String s)
	{
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)==s.charAt(j))
				{
				i++;
				j--;
				}
			else
			return false;
		}
		return true;
	}

}
