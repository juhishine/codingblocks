package lecture4_javacruxoct2022_Pattern2;

import java.util.Scanner;

public class Pattern_14 {
	/*
	*
   **
  ***
 ****
*****
 ****
  ***
   **
    *

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		/*int row=1;int star=1;
		 while(row<=2*n-1)
		  {int i=1;
		  while(i<=star){
		  System.out.print("* ");
		  i++;
		  }
		  if(row<n)
			  star++;
		  else 
			  star--;
		  row++;
		  		  System.out.println();

		  }
		  */
		/*for(int i=0;i<2*n-1;i++)
		{
	    	for (int j=0;j<n-1;j++)
		     { 
			System.out.print("  ");
		     }
	    for(int z=0;z<i;z++)
	    {
		  if(i<n)
			 System.out.print("* ");
		 else
			 System.out.print("  ");

		}
	    System.out.println();
		}
		*/
		/*int row=1;int star=1;
		 while(row<=2*n-1)
		  {int space=1;
		  while(space<n-1){
		  System.out.print("  ");
		  space++;
		  }
		  if(space<n)
			  star++;
		  else 
			  star--;
		  row++;
		  System.out.println();

		  }
		 */
		int row=1;
		int star=1;
		int space=n-1;
		while(row<= (2*n)-1)
		{   int i=1;
		while(i <= space) {
			System.out.print(" ");
			i++;
		}
		int j=1;
		while(j<=star){
			System.out.print("*");
			j++;
	    }
		System.out.println();
    if(row<n){
    	star++;
    	space--;
    	}
    else{
    	space++;
    	star--;
    }
    row++;
		}
	}

}
