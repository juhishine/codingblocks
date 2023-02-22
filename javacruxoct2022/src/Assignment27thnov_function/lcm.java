package Assignment27thnov_function;

import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
   int n1=sc.nextInt();
   int n2=sc.nextInt();
   lcmans(n1,n2);
	}
	public static void lcmans(int a , int b) {
		int lcm = (a > b) ? a : b; // 4>6?6

	    // Always true
	    while(true) {
	      if( lcm % a == 0 && lcm % b == 0 ) { 
	        System.out.print(lcm);
	        break;
	      }
	      ++lcm;	//3
	    }
	}
	

}
