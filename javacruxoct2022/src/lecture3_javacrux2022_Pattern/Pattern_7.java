package lecture3_javacrux2022_Pattern;

import java.util.Scanner;

public class Pattern_7 {
/*   its pattern 9 
      *
     ***
    *****	
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
		/*for(int i=0;i<n;i++)
		{
	    	for (int j=0;j<n-i-1;j++)
		     { 
			System.out.print("  ");
		     }
	    for(int z=0;z<i*2+1;z++)
	    {
		System.out.print("* ");
		}
	    System.out.println();
		}
		*/
	     int row=0;
	     while(row<n)
	     { 
	    	 
		     int space=n-row; //3-0
		     int i=1;
	    	 //space
	    	 while(i<space)//1<3
	    	 {
	    		 System.out.print("  ");
	    		 i++;
	    	 }
	    	 //star
	    	 int j=0;
	    	 int star=2*row+1;// 2*0+1
	    	 while(j<star)
	    	 {
	    		System.out.print("* "); 
	    		j++;
	    	 }
	    	 //next row
	    	 System.out.println();
	    	 row++;
	    	 
	     }
		
	}

}
