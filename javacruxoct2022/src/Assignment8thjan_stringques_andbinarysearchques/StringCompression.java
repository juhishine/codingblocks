package Assignment8thjan_stringques_andbinarysearchques;
import java.util.*;
public class StringCompression {
	/*
	 Take as input S, a string. Write a function that does basic string compression. Print the value returned. 
	 E.g. for input “aaabbccds” print out a3b2c2d1s1.

Input Format
A single String S

Constraints
1 < = length of String < = 1000

Output Format
The compressed String.

Sample Input
aaabbccds
Sample Output
a3b2c2d1s1
Explanation
In the given sample test case 'a' is repeated 3 times consecutively, 'b' is repeated twice, 'c' is repeated 
twice and 'd and 's' occurred only once.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		String s=sc.next();
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
	        if (count == 1)
	        {
	          System.out.print(s.charAt(i));
	        }
	        else
	        {
		          System.out.print(s.charAt(i)+""+count);
	        }
	         
	    } 
	}
}
    
