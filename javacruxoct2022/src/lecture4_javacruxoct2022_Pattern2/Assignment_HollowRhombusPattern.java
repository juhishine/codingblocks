package lecture4_javacruxoct2022_Pattern2;

import java.util.Scanner;

public class Assignment_HollowRhombusPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* For any input N. First line contains 4 space and then 5 {*} and then 
   the second line contains according to the output format.
    *****
   *   *
  *   *
 *   *
*****
 */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=n;
		int space=n-1;
		for(int i=1;i<=n;i++)
		{ for(int j=1;j<=space;j++)
		  {
			  System.out.print(" ");
		  }		  
		  for(int k=1;k<=star;k++)
		  {  if(i==1||k==1||i==n||k==n)
              System.out.print("*"); 
		      else
			  System.out.print(" "); 
		  }
		  space--;
		  System.out.println();
		}
	}

}
