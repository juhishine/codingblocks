package Assignment27thnov_function;

import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int gcd=gcdans(n1,n2);
		System.out.println(gcd);
	}
	public static int gcdans(int dividend, int divisor)
	{int lcm = (dividend > divisor) ? dividend : divisor; // 4>6?6

	    // Always true
	    while(true) {
	      if( lcm % dividend == 0 && lcm % divisor == 0 ) { 
	        break;
	      }
	      ++lcm;
    }
int gcd=(divisor*dividend)/lcm;
return gcd;

    }
}