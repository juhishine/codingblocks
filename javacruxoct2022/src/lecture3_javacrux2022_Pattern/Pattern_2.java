package lecture3_javacrux2022_Pattern;

import java.util.Scanner;

public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /* *
          **
          ***
        */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		/*for(int i=1;i<=n;i++)
			{
			for(int j=1;j<=i;j++)
			{System.out.print("* ");
			}
			System.out.println();
			}
			*/
		
		  int row=1;
		  while(row<=n)
		  {int j=1;
		  while(j<=row){
		  System.out.print("* ");
		  j++;
		  }
		  System.out.println();
		  row++;
		  }
		  
		  /*
		   int row=1;int star=1;
		   while (row<=n)
		   while(
		   row++;
		   star++;		   */
		  
		  
		 
	}

}
