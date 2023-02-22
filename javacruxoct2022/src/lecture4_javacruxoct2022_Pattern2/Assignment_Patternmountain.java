package lecture4_javacruxoct2022_Pattern2;

import java.util.Scanner;

public class Assignment_Patternmountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
                       1           1  //2  //10  4*3-2
                       1 2       2 1  4    //6  4*2-2
                       1 2 3   3 2 1  6    //2  4*1-2
                       1 2 3 4 3 2 1   7   //0    4*0-1

		 */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int val;
		int row2=1;
		for(int i=n;i>=1;i--)
		{  val=1;
		   int countspace=n*(i-1)-2;
		  for(int j=n;j>=i;j--)
		  {  
			System.out.print(val+" "); 
			val++;
		  }
		  for(int k=1;k<=countspace;k++) 
		  { System.out.print(" ");
		  }  
		  val=1;
		  int k=row2;
		  int l=1;
		  if(row2==n)
			  {row2--;
		        k--;}
		  for( l=1;l<=row2;l++)
		  { 
			System.out.print(k+" "); 
			k--;
			
		  }
			System.out.println();
			countspace=countspace-2;
			row2++;
		}
	}
}
