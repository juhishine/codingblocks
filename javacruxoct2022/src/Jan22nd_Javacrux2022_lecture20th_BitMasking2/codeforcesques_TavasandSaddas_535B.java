package Jan22nd_Javacrux2022_lecture20th_BitMasking2;

import java.util.Scanner;

public class codeforcesques_TavasandSaddas_535B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 Once again Tavas started eating coffee mix without water! Keione told him that it smells awful, but he 
 didn't stop doing that. That's why Keione told his smart friend, SaDDas to punish him! SaDDas took Tavas' 
 headphones and told him: "If you solve the following problem, I'll return it to you."


The problem is:

You are given a lucky number n. Lucky numbers are the positive integers whose decimal representations 
contain only the lucky digits 4 and 7. For example, numbers 47, 744, 4 are lucky and 5, 17, 467 are not.

If we sort all lucky numbers in increasing order, what's the 1-based index of n?

Tavas is not as smart as SaDDas, so he asked you to do him a favor and solve this problem so he can have his 
headphones back.

Input
The first and only line of input contains a lucky number n (1 ≤ n ≤ 109).

Output
Print the index of n among all lucky numbers.
a(r^n-1)/(r-1)
2^1+2^2+.....2^n-1
= 2(2^(n-1)-1)/(2-1)=2^n-2
string me input le lenge ,1<<n// 2<<n-2

*its done by 2 recursion call ..then sort 
n string hai.. n-1 nikale hai 
amazon, google me aane wale ques hai */
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(Index(str));
	}
	public static int Index(String str)
	{
		int n=str.length();
		int pos=0;
		int count=(1<<n)-2;// ye aagaya n se chote wale saare code aa gaye 
		//n-1 tak ke saare lucky number ka count hai ye
		for (int j = str.length()-1; j >=1; j--) {
			if(str.charAt(j)=='7')
			{
			count=count+(1<<pos);
			}	
			pos++;
		}
		return count+1;
		
	}
	

}
