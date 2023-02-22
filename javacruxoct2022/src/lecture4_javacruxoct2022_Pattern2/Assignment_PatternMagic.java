package lecture4_javacruxoct2022_Pattern2;

import java.util.Scanner;

public class Assignment_PatternMagic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
*********
**** ****
***   ***
**     **
*       *
**     **
***   ***
**** ****
*********       
		 */
		
		        Scanner sc=new Scanner(System.in);
		        int n=sc.nextInt();
		        int row=1;int star=n;int space=-1;
		        while(row<=2*n-1)//1<=9
		        {int i=1;
		        while(i<=star)//1<=5,1<=4,3,2,1
		        {System.out.print("*");
		        i++;}
		        int j=1;
		        while(j<=space)//1<-1.,1,3,5,7
		        {System.out.print(" ");j++;}
		        int k=1;
		        if(row==1||row==2*n-1)k=2;
		        while(k<=star)//2<=5,1<=4,1<=3,1<=2,
		        	{System.out.print("*");k++;}
		        if(row<n) {star-=1;space+=2;}
		        else {star+=1;space-=2;}
		        System.out.println();
		        row++;
		        }

		       /* int row=1;
		        int star=n/2+1;
		        int space=-1;

		        while(row<=n)
		        {
		            int i=1;
		            while(i<=star)
		            {
		                System.out.print("*     ");
		                i++;
		            }
		            int j=1;
		            while(j<=space)
		            {
		                System.out.print("      ");
		                j++;
		            }
		            int k=1;
		            if(row==1 || row==n)
		            {
		                k=2;
		            }
		            while(k<=star)
		            {
		                System.out.print("*     ");
		                k++;
		            }
		            if(row<n/2+1)
		            {
		                star--;
		                space+=2;
		            }
		            else
		            {
		                star++;
		                space-=2;
		            }
		            System.out.println();
		            row++;
		        }*/
		    }
		}
