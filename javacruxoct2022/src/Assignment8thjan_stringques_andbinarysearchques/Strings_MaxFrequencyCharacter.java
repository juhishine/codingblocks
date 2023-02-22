package Assignment8thjan_stringques_andbinarysearchques;

import java.util.Scanner;

public class Strings_MaxFrequencyCharacter {
	/*
	 Take as input S, a string. Write a function that returns the character with maximum frequency. Print the 
	 value returned.

Input Format
String

Constraints
A string of length between 1 to 1000.

Output Format
Character

Sample Input
aaabacb
Sample Output
a
Explanation
For the given input string, a appear 4 times. Hence, it is the most frequent character.
122445362*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		//System.out.println(s1.compareTo(s2));
		System.out.println(string_maxfreqchar(s1));
	}
	public static char string_maxfreqchar(String s1)
	{
	int count;
	char maxfrequencychar='b';
	int maxcount=0;
	for(int i=0;i<s1.length()-1;i++)
		{ 
		count=0;
		for (int j = 0; j < s1.length(); j++) {	
			if(s1.charAt(i)==s1.charAt(j))
              {
				count++;
              }
         }	
		if(count>maxcount)
			{
			maxcount=count;
		maxfrequencychar=s1.charAt(i);
			}
		}
	
	
     return maxfrequencychar;
	}

}
