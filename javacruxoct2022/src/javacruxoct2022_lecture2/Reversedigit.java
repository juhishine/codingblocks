package javacruxoct2022_lecture2;

import java.util.Scanner;

public class Reversedigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
       int rem=0;
		int reverse=0;
		while(n>0)
		{ rem=n%10;
		  reverse=reverse*10+rem;
		  n=n/10;
		
		}
		System.out.println("reverse the digit" + reverse);

	}

}
