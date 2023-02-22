package jan8thjavacrux2022_lecture16_stringpart1;

import java.util.Scanner;

public class reversewords_151_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner sc=new Scanner(System.in);
		String s=" a good example ";
		System.out.println(Reverse(s));
}

	public static String Reverse(String s)
	{  s=s.trim();
	
	String[] arr=s.split("\s+");//+sign isliye lagaya hai ,multiple space ko hatane ke liye

	String ans=" ";
	for(int j=arr.length-1;j>=0;j--)
		{
		ans=ans+arr[j]+" ";}
	return ans.trim();
	}
}