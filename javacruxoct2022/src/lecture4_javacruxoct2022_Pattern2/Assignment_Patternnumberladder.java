package lecture4_javacruxoct2022_Pattern2;

import java.util.Scanner;

public class Assignment_Patternnumberladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* input =4
1  
2	3  
4	5	6  
7	8	9	10

 */
		Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     int val=1;
		for(int i=1;i<=n;i++)
		{
	    for(int j=1;j<=i;j++)
	        {  
			 System.out.print(val+' '); 
			 val++;
		    }
	    System.out.println();
		}
	}

}
