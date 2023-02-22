package leetcode_string_8thjan;

public class Reverse_String_155_realques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s= {'h','l','o'};
		reverseString(s);
	}
		public static void reverseString(char[] s) {
	        int i=0;
	        int j=s.length-1;
	        char temp;
	        while(i<j)
	        {
	            temp=s[i];
	           s[i]=s[j];
	           s[j]=temp;
	            i++;
	            j--;
	        }
	        for(int k=0;k<s.length;k++)
	        {
	            System.out.print(s[k]);
	        }

	    }
	    }