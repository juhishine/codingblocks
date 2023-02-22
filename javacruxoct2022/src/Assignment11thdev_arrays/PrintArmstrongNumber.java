package Assignment11thdev_arrays;

import java.util.Scanner;

public class PrintArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] a=new int[n-m+1];
		int i=1;
		while(true)
		{System.out.println(a[i]);
		i++;}
	}
	public static int[] armstrong(int n,int m, int[] a)
	{    a=new int[n-m+1];

		for(int i=n;i<=m;i++)	
		{a[i]=i;
		int temp=a[i];
		int sum=0;
		while(a[i]!=0)
		{
		int rem=a[i]%10;//153
		sum+=(int)Math.pow(rem,3);
		a[i]=a[i]/10;
		}
		if(sum==temp)
			return i;
		}	
	}
}
*/
		Scanner scc = new Scanner (System.in);
        int n1 = scc.nextInt();
        int n2 = scc.nextInt();
        for(int i=n1;i<=n2;i++)	
        {if(Armstrong(i)==true)
        	System.out.println(i);
        }
	}

	public static boolean Armstrong(int n) {
		int c = countofdigit(n);
		int temp = n;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = (int) (sum + Math.pow(rem, c));
			n = n / 10;
		}
		
		return sum==temp;
	}

	public static int countofdigit(int n) {
		int c = 0;
		while (n > 0) {
			n = n / 10;
			c++;
		}
		return c;
	}
}