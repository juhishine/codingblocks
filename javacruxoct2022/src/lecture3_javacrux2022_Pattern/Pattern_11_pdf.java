package lecture3_javacrux2022_Pattern;

import java.util.Scanner;

public class Pattern_11_pdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Done n=5
    *
   * *
  * * *
 * * * *
* * * * *
				 */
		Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
	    	for (int j=1;j<=n-i;j++)
		     { 
			System.out.print(" ");//space 4,3,2,1,0
		     }
	    for(int z=1;z<=i;z++)
	    {
		System.out.print("* ");// star 1,2,3,4,5
		}
	    System.out.println();
		}


	}

}
