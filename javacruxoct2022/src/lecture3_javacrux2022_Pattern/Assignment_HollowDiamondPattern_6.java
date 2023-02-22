package lecture3_javacrux2022_Pattern;

import java.util.Scanner;

public class Assignment_HollowDiamondPattern_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
     * * * * *
     * *   * *
     *       *
     * *   * *
     * * * * *

		 */
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int row=1;
		int star=n/2+1; //3
		int space=-1;
		while(row<=n)//1<=5
			{int i=1;
			while(i<=star)
				{System.out.print("* ");
				i++;
				}
			int j=1;
			while(j<=space)
			{ 
				System.out.print("  ");
				j++;
			}
		    int k=1;
		    if(row==1||row==n)
		    {
		    	k=2;
		    }
		    while(k<=star)
		    {
		    	System.out.print("* ");
		    	k++;
		    }
		    if(row<n/2+1)//1<3
		    {star--;
		    space=space+2;
		    }
		    else
		    {star++;
		    space=space-2;
		    }
		    System.out.println();
		    row++;
			}
			
}
}
