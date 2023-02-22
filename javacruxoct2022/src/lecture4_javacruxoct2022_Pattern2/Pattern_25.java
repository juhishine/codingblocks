package lecture4_javacruxoct2022_Pattern2;

import java.util.Scanner;

public class Pattern_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int val=1;
		for(int i=0;i<n;i++)
		{ 
			for(int space=1;space<=n-i;space++)
			{System.out.print("  ");
			}
			
			for(int j=1;j<=2*i+1;j++)
			{System.out.print(val +" ");
			val++;
			}
			System.out.println();
		}


	}

}
