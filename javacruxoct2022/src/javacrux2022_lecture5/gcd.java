package javacrux2022_lecture5;

import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a*b=hcf*gcd
		Scanner sc=new Scanner(System.in);
		int divisor=sc.nextInt();
		int dividend=sc.nextInt();
		int hcf,gcd;
		while(dividend%divisor!=0)
		{
			int remainder=dividend%divisor;
			dividend=divisor;
			divisor=remainder;
		}
hcf=divisor;
gcd=(divisor*dividend)/hcf;
System.out.println(gcd);

	}

}
