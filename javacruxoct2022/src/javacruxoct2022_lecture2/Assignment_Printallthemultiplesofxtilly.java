package javacruxoct2022_lecture2;

import java.util.Scanner;

public class Assignment_Printallthemultiplesofxtilly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;int x,y;
		Scanner sc=new Scanner(System.in);
		x= sc.nextInt();
		y=sc.nextInt();
//		while((x*i)<y)
//		{
//			System.out.println(x*i);
//			i++;
//		}
		for( i=1; (x*i)<y;i++)
		{ System.out.println(x*i);i++;}
		

	}

}
