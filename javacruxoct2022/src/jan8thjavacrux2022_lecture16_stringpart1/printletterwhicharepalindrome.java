package jan8thjavacrux2022_lecture16_stringpart1;
import java.util.Scanner;

public class printletterwhicharepalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		System.out.println(Palindromesubstrings(s1));
	}
	public static boolean Palindromesubstrings(String s1)
	{
		
		for(int k=0;k<s1.length();k++)
		{
			for(int m=k+1;m<s1.length();m++)
		{
			String s=s1.substring(k,m);
			if(palindrome(s)==true)
				System.out.println(s);
		}
		}
		return true;
	}
	public static boolean palindrome(String s1)
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