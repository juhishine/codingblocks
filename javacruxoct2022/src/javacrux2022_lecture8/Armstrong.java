package javacrux2022_lecture8;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner sc=new Scanner(System.in);
		 * 
		 * int n=sc.nextInt(); int s=n; int f=s; int rem1; int sum=0;int count=0;
		 * while(n>0) {
		 * 
		 * n=n/10; count++;
		 * 
		 * } while(s>0) { rem1=s%10; sum+=Math.pow(rem1, count); s=s/10; } if(sum==f)
		 * {System.out.println("true");} else {System.out.println("false");}
		 * 
		 * }
		 * 
		 * }
		 */
		int n = 1634;
		System.out.println(IsArmstrong(n));
	}

	public static boolean IsArmstrong(int n) {
		int c = countofdigit(n);
		int temp = n;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = (int) (sum + Math.pow(rem, c));
			n = n / 10;
		}
		System.out.println(sum);
		return sum == temp;
	}

	public static int countofdigit(int n) {
		int c = 0;
		while (n > 0) {
			n = n / 10;
			c++;
		}
		return c;
	}
}
