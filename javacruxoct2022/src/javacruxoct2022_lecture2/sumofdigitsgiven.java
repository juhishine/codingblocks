package javacruxoct2022_lecture2;

import java.util.Scanner;

public class sumofdigitsgiven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int rem=0;
	
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		while(n>1)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);
		

	}

}
