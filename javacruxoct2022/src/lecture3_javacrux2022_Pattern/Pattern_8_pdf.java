package lecture3_javacrux2022_Pattern;

import java.util.Scanner;

public class Pattern_8_pdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* n=5
*   *
 * *
  *
 * *
*   *

		 */
		Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     int row=1;
	     int star=1;
	     int space=0;
	     int space2=n-2;//3
	     while(row<=n)//1<=5
	     {int i =1;
	     while(i<=space)//1<=0
	    	 {System.out.print(" ");
	       i++;
	    	 }
	     System.out.print("*");
	     int k=1;
	     while(k<=space2)
	     {
	    	 System.out.print(" ");
	    	 k++;
	     }
	     int j=1;
	     if(row==n/2+1)
	     {
	    	 j=2;
	     }
	     while(j<=star)
	     {System.out.print("*");
	     j++;
	     }
	     if(row<n/2+1)
	     {space++;
	     space2-=2;
	     }
	     else
	     {
	    	 space--;
	    	 space2+=2;
	     }
	     System.out.println();
	     row++;
	     }
		/*for(int i=1;i<=n;i++)
		{
	    	for (int j=1;j<n-2*i-1;j++)
		     { 
			System.out.print("* ");
		     }
	    for(int z=0;z<i*2+1;z++)
	    {
		System.out.print("  ");
		}
	    System.out.println();
		}
*/

	}

}
