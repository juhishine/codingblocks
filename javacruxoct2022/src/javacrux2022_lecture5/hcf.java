package javacrux2022_lecture5;

import java.util.Scanner;

public class hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int divisor=sc.nextInt();
		int dividend=sc.nextInt();
		while(dividend%divisor!=0)
		{
			int remainder=dividend%divisor;
			dividend=divisor;
			divisor=remainder;
		}
System.out.print(divisor);
	}
}
