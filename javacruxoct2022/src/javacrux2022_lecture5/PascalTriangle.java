package javacrux2022_lecture5;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* leet code question ,interview ques, ncr r starts by 0 in every row // r is i , n is row
1  
1	1  
1	2	1  
1	3	3	1  
1	4	6	4	1  
1	5	10	10	5	1
		 */
		Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	    /* for(int i=0;i<n;i++)
	     {for(int j=0;j<i;j++)
	    	 System.out.print(i+j +" ");
	     
	     System.out.println();
	}*/
	     int row=0;
	     int star=1;
	     while(row<n)
	     {
	    	 int i=0;
	    	 int val=1;
	     while(i<star)
	    	 {
	    	 System.out.print(val+" ");
	    	 val=((row-i)*val)/(i+1);
	    	 i++;
	    	 }
	     System.out.println();
	     row++;
	     star++;
	     }	     
	}

}
