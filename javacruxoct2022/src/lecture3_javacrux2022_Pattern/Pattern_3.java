package lecture3_javacrux2022_Pattern;
import java.util.*;

public class Pattern_3 {
	/* ***
	   **
	   *
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     for(int i=n;i>=1;i--)
     {for(int j=1;j<=i;j++)
    	 {System.out.print("* ");
         }
     System.out.println();
     }
	}

}
