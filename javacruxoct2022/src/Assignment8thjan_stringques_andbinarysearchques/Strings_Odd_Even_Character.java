package Assignment8thjan_stringques_andbinarysearchques;

import java.util.Scanner;

public class Strings_Odd_Even_Character {
	/*
	 Take as input S, a string. Write a function that replaces every even character with the character having 
	 just higher ASCII code and every odd character with the character having just lower ASCII code. Print the
	  value returned.

Input Format
String

Constraints
Length of string should be between 1 to 1000.

Output Format
String

Sample Input
abcg
Sample Output
badf*/

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
			if(i%2==0)
			{ 
				ch[i]=s.charAt(i);
                ++ch[i];				
			}
			else
			{ 
				ch[i]=s.charAt(i);
				--ch[i];
			}
				
		}
		return ch;
	}

}
