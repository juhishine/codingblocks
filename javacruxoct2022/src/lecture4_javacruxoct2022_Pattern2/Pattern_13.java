package lecture4_javacruxoct2022_Pattern2;

import java.util.Scanner;

public class Pattern_13 {
	/*  
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		/*int row=1;
		int star=1;
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
		  	for(int i=1;i<=2*n-1;i++)
			{ 
		  		int starcount=(i<=n)?i:2*n-i;
			for(int j=1;j<=starcount;j++)
			{
			System.out.print("* ");
		    }
			System.out.println();
			}
		
	}

}
