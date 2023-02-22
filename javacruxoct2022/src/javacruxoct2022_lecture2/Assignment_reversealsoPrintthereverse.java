package javacruxoct2022_lecture2;

import java.util.Scanner;

public class Assignment_reversealsoPrintthereverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int x,rem=0;
		int rev=0;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		while(x>0)
		{
			 rem=x%10;  
			 rev=rev*10+rem;  
			 x=x/10;	
		}
		System.out.println(rev);
	}

}
