package javacruxoct2022_lecture2;

import java.util.Scanner;

public class Count_the_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int rem=0;
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		while(n>0)
		{
			rem=n%10;
			i++;
			n=n/10;

	}
		System.out.println("count digit " + i);

}
}
