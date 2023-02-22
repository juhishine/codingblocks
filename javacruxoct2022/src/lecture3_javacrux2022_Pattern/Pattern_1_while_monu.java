package lecture3_javacrux2022_Pattern;

import java.util.Scanner;

public class Pattern_1_while_monu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ***
		   ***
		   ***
		 */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=n;
		while(row<=n)
		{int i =1;
		while(i<=star)
		{System.out.print("* ");
		i++;
		}
		System.out.println();
		row++;
		}

	}

}
