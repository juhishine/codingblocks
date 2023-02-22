package Assignment8thjan_stringques_andbinarysearchques;

import java.util.Scanner;

public class Strings_StringCompression {
/*
 Take as input S, a string. Write a function that does basic string compression. Print the value returned. E.g.
  for input “aaabbccds” print out a3b2c2ds.

Input Format
A single String S.

Constraints
A string of length between 1 to 1000

Output Format
The compressed String.

Sample Input
aaabbccds
Sample Output
a3b2c2ds
Explanation
In the given sample test case 'a' is repeated 3 times consecutively, 'b' is repeated twice, 'c' is repeated 
twice. But, 'd' and 's' occurred only once 
that's why we do not write their occurrence.
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaabbccds";
		String_Compression(s);
	}
	public static void String_Compression(String s)
	{       int len = s.length(); 
	       for (int i = 0; i < len; i++) { 
	    	  
	        // Count occurrences of current character 
	        int count = 1; 
	        while (i < len - 1 && s.charAt(i) == s.charAt(i+1)) { 
	            count++; 
	            i++; 
	        }
	        // Print character and its count
		          System.out.print(s.charAt(i)+""+count);
	        
	         
	    } 
	}
}
    