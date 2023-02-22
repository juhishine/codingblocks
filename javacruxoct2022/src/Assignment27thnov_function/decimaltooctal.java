package Assignment27thnov_function;

import java.util.Scanner;

public class decimaltooctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			btod(n);
		}
		public static void btod(int b)
		{int sum=0;
		int rem=0;
		int mul=1;
			while(b>0)
			{
				
				rem=b%8;
				sum=(int)sum+rem*mul;
				b=b/8;
				mul=mul*10;

			}
			int sumb=(int)sum;
			System.out.println(sumb);
		}


	}


