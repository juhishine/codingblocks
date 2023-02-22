package leetcode_string_8thjan;

public class Reverse_String2_ques541 {
	/*
	Given a string s and an integer k, reverse the first k characters for every 2k characters counting from 
	the start of the string.

If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or 
equal to k characters, then reverse the first k characters and leave the other as original.

 

Example 1:

Input: s = "abcdefg", k = 2
Output: "bacdfeg"*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdefg";int k=5;
		reverseStr(s,k);
		//System.out.println(reverseStr(s,k));
	}

		public static void reverseStr(String s, int k) {
			String[] arr=s.split("");
	        int i=0;int j=k-1;
	        String temp;
	        while(i<j)
	        {
	        	temp=arr[i];
	        	arr[i]=arr[j];
	        	arr[j]=temp;
	        	i++;j--;
	        	System.out.println(arr[i]);
	        }
	        
            //s = arr.toString();
	        //return s;
	    }
	}


