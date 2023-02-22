package Assignment8thjan_stringques_andbinarysearchques;

import java.util.Scanner;

public class Strings_DifferenceinAsciiCodes {
	/*
	 Take as input S, a string. Write a program that inserts between each pair of characters the difference 
	 between their ascii codes and print the ans.

Input Format
String

Constraints
Length of String should be between 2 to 1000.

Output Format
String

Sample Input
acb
Sample Output
a2c-1b
Explanation
For the sample case, the Ascii code of a=97 and c=99 ,the difference between c and a is 2.Similarly ,the Ascii 
code of b=98 and c=99 and their difference is -1. So the ans is a2c-1b.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		//System.out.println(s1.compareTo(s2));
		StringdifferenceinAsciicode(s1);
	}
	public static void StringdifferenceinAsciicode(String s1)
	{    char[] ch=new char[s1.length()];
	 String s=new String(" ");int diff=0;
		for(int i=0,j=i+1;j<s1.length();i++,j++)
		{ 
		ch[i]=s1.charAt(i);
		System.out.print(ch[i]);//a
		ch[j]=s1.charAt(i+1);
		//System.out.println(ch[j]);//c
		diff=(int)ch[j]-ch[i];
		System.out.print(diff);
	    //s= Integer.toString(ch[i]+diff+ch[j]);
		}
		System.out.print(ch[s1.length()-1]);
		
	}

}
