package Assignment8thjan_stringques_andbinarysearchques;

import java.util.Scanner;

public class Strings_ToggleCase {
	/*
	 Take as input S, a string. Write a function that toggles the case of all characters in the string. Print 
	 the value returned.

Input Format
String

Constraints
Length of string should be between 1 to 1000.

Output Format
String

Sample Input
abC
Sample Output
ABc
Explanation
Toggle Case means to change UpperCase character to LowerCase character and vice-versa.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.print(replacevenwithhigherAsciiviceversa(s));
	}
	public static char[] replacevenwithhigherAsciiviceversa(String s)
	{ char[] ch=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=91)
			{ 
				ch[i]=(char)((int)s.charAt(i)+32);
			}
			else
			{ 
				ch[i]=(char)((int)s.charAt(i)-32);
			}
				
		}
		return ch;
	}

}