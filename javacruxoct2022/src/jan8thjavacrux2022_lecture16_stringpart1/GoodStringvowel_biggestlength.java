package jan8thjavacrux2022_lecture16_stringpart1;

import java.util.Scanner;

public class GoodStringvowel_biggestlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		substring(s1);
		System.out.println(isVowelGoodstring(s1));
	}
	public static void substring(String s1)
	{
		for(int i=0;i<s1.length();i++)
			for(int j=0;j<=s1.length();j++)
				{
				System.out.println(isVowelGoodstring(s1.substring(i,j)));
				}
	}

	public static int isVowelGoodstring(String s1)
	{int count=0,ans=0;
	for (int i = 0; i < arr .length; i++) {
		
	}
		if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
			count++;
		}
	 max=Math.max(count, max);
	return max;
	}
	public static boolean vowel(char ch)
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{return true;}
	}

}
