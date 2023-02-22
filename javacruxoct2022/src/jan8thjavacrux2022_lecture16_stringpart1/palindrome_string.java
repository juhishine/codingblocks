package jan8thjavacrux2022_lecture16_stringpart1;

import java.util.Scanner;

public class palindrome_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		//System.out.println(s1.compareTo(s2));
		System.out.println(isPalindrome(s1));
	}
	public static boolean isPalindrome(String s1)
	{
		int i=0;int j=s1.length()-1;
		while(i<j)//two pointer approach
		{
			if(s1.charAt(i)!=s1.charAt(j))
				{return false;}
			i++;
			j--;
		}
		return true;
	}

}
