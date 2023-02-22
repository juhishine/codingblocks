package Assignment8thjan_stringques_andbinarysearchques;

import java.util.Scanner;

public class Strings_RemoveDuplicates {
	/*
	 Take as input S, a string. Write a function that removes all consecutive duplicates. Print the value 
	 returned.

Input Format
String

Constraints
A string of length between 1 to 1000

Output Format
String

Sample Input
aabccba
Sample Output
abcba
Explanation
For the given example, "aabccba", Consecutive Occurrence of a is 2, b is 1, and c is 2.

After removing all of the consecutive occurences, the Final ans will be : - "abcba".*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(removeduplicate_in_string(s));
	}
	public static String removeduplicate_in_string(String s)
	{ 
	 //char[] h=new char[s.length()];
		int j=0;String s1="";
	for (int i = 0; i <s.length()-1; i++) {
		if(s.charAt(i)!=s.charAt(i+1))//0,1//1,2
		{
		  s1+=s.charAt(i);
		 j++;
		}	
	}
	s1+=s.charAt(s.length()-1);
	return s1;
		
	}
		
}