package javacrux2022_lecture7_Datatype;

import java.util.Scanner;

public class decimal_to_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int mul=1;
	    int sum=0;
	    
		while(n>0)
		{ int rem=n%2;
		sum=sum+rem*mul;
		n=n/2;//n/=2
		mul=mul*10;
		}
		System.out.print(sum);// source wale se mul , destination wale se divide// source(10) to des(2), this formula applicable for any one 10 source or des 
	}
}
